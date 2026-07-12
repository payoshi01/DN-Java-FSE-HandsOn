import React from "react";
import CalculateScore from "./components/CalculateScore";

function App() {

    return (

        <div>

            <CalculateScore

                name="Payoshi Gupta"

                school="Delhi Public School"

                total={475}

                goal={5}

            />

        </div>

    );

}

export default App;
