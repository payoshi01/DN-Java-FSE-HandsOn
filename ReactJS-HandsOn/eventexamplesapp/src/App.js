import React from "react";

import Counter from "./Components/Counter";

import CurrencyConverter from "./Components/CurrencyConverter";

function App() {

    return (

        <div
            style={{
                textAlign: "center",
                marginTop: "30px"
            }}
        >

            <h1>Event Examples App</h1>

            <Counter />

            <CurrencyConverter />

        </div>

    );

}


export default App;

