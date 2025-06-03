CREATE (:Client {name: "Pedro Silva", age: 25, hobbies: ['Videogames','Books','Tech'] })
MATCH (pedro_silva) return pedro_silva

CREATE (:Client {name: "Gabriel Souza", age: 24, hobbies: ['Violin', 'Skate', 'Books']}) -[:Bloqueado]->(:Client {name: "Hugo Santos", hobbies: ["Books", "Tech"]})
CREATE (:Object)
MATCH (all) return all

MATCH (clients:Client) return clients
MATCH (c:Client {name: "Gabriel Souza"})-[:Bloqueado]->(blocked)

MATCH (c1:Client {name: "Pedro Silva"}), (c2:Client {name: "Hugo Santos"}) return c1, c2
MATCH (c1:Client {name: "Pedro Silva"}), (c2:Client {name: "Hugo Santos"}) CREATE (c2)-[:Bloqueado]->(c1)

MATCH (c1:Client {name:"Gabriel Souza"})-[block:Bloqueado]->(:Client {name:"Hugo Santos"}) DELETE block
MATCH (c1:Client {name:"Pedro Silva"})-[block:Bloqueado]->() DELETE block
MATCH (c1:Client {name: "Gabriel Souza"}) DELETE c1

MATCH (c1:Client {name: "Hugo Santos"}) SET c1.age = 27

MATCH (o1:Object) SET o1:Client, o1.name = "Carlos Oliveira"
MATCH (o1:Object) REMOVE o1:Object