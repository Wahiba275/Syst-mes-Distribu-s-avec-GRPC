<h2>Systèmes distribuées avec gRPC</h2>
<h4>Systèmes distribuées</h4>
<p>Un système distribué est un ensemble de nœuds autonomes (ou processus) interconnectés qui collaborent pour atteindre un objectif commun. Chaque nœud possède une certaine quantité de ressources informatiques (par exemple, processeurs, mémoire, stockage, périphériques d'entrée/sortie) et est capable de communiquer avec les autres nœuds via un réseau de communication.</p>
<h4>gRPC</h4>
<p>gRPC est un framework de communication à distance open source développé par Google, qui permet aux applications de communiquer de manière efficace et fiable à travers des réseaux distribués. Il est basé sur le protocole RPC (Remote Procedure Call), qui permet à une application d'appeler des méthodes ou des fonctions sur une autre application située sur un autre ordinateur ou sur un autre système.
<br>
gRPC utilise le protocole HTTP/2 comme transport, ce qui offre des avantages tels que la gestion de flux, la compression, la multiplexage de requêtes et de réponses, et une faible latence. Il utilise également des codecs de sérialisation tels que Protocol Buffers, qui offrent une représentation compacte et efficace des données, ce qui réduit la taille des messages envoyés sur le réseau.
</p>
<h4>Fichier Chat.proto</h4>
<p>Le fichier Chat.proto est un fichier de définition de protocole pour le framework de communication à distance gRPC.  Ce service expose quatre méthodes différentes, chacune avec un modèle de communication différent :</p>
<ul>
<li>convert : est une méthode de modèle d'appel unique (unary model) qui prend en charge la conversion d'une devise à une autre et renvoie une réponse de conversion unique.</li>
<li>getCurrencyStream : est une méthode de modèle de flux de serveur (server stream model) qui prend en charge la conversion d'une devise à une autre et renvoie un flux continu de réponses de conversion.</li>
<li>performStream : est une méthode de modèle de flux de client (client streaming model) qui prend en charge la conversion de plusieurs devises à la fois en envoyant un flux continu de requêtes de conversion et renvoie une réponse unique de conversion.</li>
<li>fullCurrencyStream : est une méthode de modèle de flux bidirectionnel (Bidirectional streaming model) qui prend en charge la conversion de plusieurs devises à la fois en envoyant et recevant un flux continu de requêtes et de réponses de conversion.</li>
</ul>
<p>Les messages "ConvertCurencyRequest" et "ConvertCurrencyResponse" définissent les données envoyées et reçues par les différentes méthodes du service. "ConvertCurencyRequest" contient les informations nécessaires pour effectuer une conversion de devise, telles que la devise d'origine et la devise cible, tandis que "ConvertCurrencyResponse" contient le résultat de la conversion, ainsi qu'un message optionnel.</p>
<h4>Classe ChatGrpcService</h4>
<p>Il s'agit d'une classe Java appelée ChatGrpcService qui implémente un service gRPC pour une application de chat. Le service fournit quatre méthodes.
Les trois premières méthodes ne sont pas utilisées dans mon application de chat. La méthodes la plus importante est 
<b>fullCurrencyStream</b>. Cette méthode retourne un <b>StreamObserver</b> qui gère un chat complet entre plusieurs utilisateurs. Elle conserve un HashMap de <b>StreamObserver</b> pour chaque devise afin de les identifier. Lorsqu'elle reçoit une demande <b>ConvertCurrencyRequest</b>, elle vérifie si elle doit l'envoyer à tous les autres utilisateurs ou seulement à un utilisateur spécifique. Elle envoie ensuite la demande à <b>l'responseObserver</b> approprié.
</p>
<h4>classe GrpcServer</h4>
<p>la classe GrpcServer est utilisée pour créer et lancer un serveur gRPC.
La méthode <b>main</b> est la méthode principale de cette classe, qui sera exécutée lors de l'exécution de l'application. Dans cette méthode, un nouveau serveur gRPC est créé en utilisant <b>ServerBuilder</b>. Le port sur lequel le serveur doit écouter les demandes est spécifié comme argument de la méthode <b>forPort()</b>. Ensuite, un nouveau service gRPC est ajouté au serveur en utilisant la méthode <b>addService()</b>. Dans ce cas, c'est l'objet <b>ChatGrpcService</b> qui est ajouté comme service. Enfin, le serveur est démarré en appelant la méthode <b>start()</b>, et la méthode <b>awaitTermination()</b>  est utilisée pour attendre que le serveur se termine.</p>
<h4>Classe GrpcClient</h4>
<p>est un client gRPC permettant de communiquer avec un serveur distant.
<br>
Le client se connecte au serveur distant en utilisant l'adresse IP et le port du serveur, puis crée un canal de communication en utilisant la classe <b>ManagedChannelBuilder</b>.<br>
Ensuite, il crée un stub, qui est une classe générée automatiquement à partir du fichier proto qui a été compilé. Cette classe est utilisée pour appeler les méthodes du service distant.
Le client utilise le stub pour appeler la méthode performStream() du service distant, en passant en paramètre un objet StreamObserver. Cette méthode permet au client d'envoyer des requêtes de manière asynchrone au serveur.
Dans la boucle while, le client lit les entrées de l'utilisateur pour les champs "from", "to" et "message", puis crée un objet <b>ConvertCurencyRequest</b> à partir de ces entrées et l'envoie au serveur en utilisant la méthode <b>onNext()</b> du StreamObserver.
<br>
Lorsque le serveur répond à la requête, la méthode <b>onNext() </b> est appelée sur l'objet StreamObserver, permettant ainsi d'afficher la réponse du serveur. En cas d'erreur, la méthode <b>onError()</b> est appelée, et en fin de communication, la méthode <b>onCompleted()</b> est appelée.
</p>