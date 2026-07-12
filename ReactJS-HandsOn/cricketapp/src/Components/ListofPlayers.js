import React from "react";

function ListofPlayers() {

    const players = [

        { name: "Virat", score: 95 },
        { name: "Rohit", score: 82 },
        { name: "Gill", score: 45 },
        { name: "Rahul", score: 75 },
        { name: "Pant", score: 55 },
        { name: "Hardik", score: 90 },
        { name: "Jadeja", score: 67 },
        { name: "Ashwin", score: 71 },
        { name: "Bumrah", score: 88 },
        { name: "Shami", score: 62 },
        { name: "Siraj", score: 79 }

    ];

    const below70 = players.filter(player => player.score < 70);

    return (

        <div>

            <h2>All Players</h2>

            <ul>

                {

                    players.map((player, index) => (

                        <li key={index}>

                            {player.name} - {player.score}

                        </li>

                    ))

                }

            </ul>

            <h2>Players with Score below 70</h2>

            <ul>

                {

                    below70.map((player, index) => (

                        <li key={index}>

                            {player.name} - {player.score}

                        </li>

                    ))

                }

            </ul>

        </div>

    );

}

export default ListofPlayers;