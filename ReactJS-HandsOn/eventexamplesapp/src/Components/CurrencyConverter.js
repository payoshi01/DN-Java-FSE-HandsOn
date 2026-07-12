import React, { useState } from "react";

function CurrencyConverter() {

    const [rupees, setRupees] = useState("");

    const [euro, setEuro] = useState("");

    const handleSubmit = () => {

        const result = (rupees / 90).toFixed(2);

        setEuro(result);

    };

    return (

        <div style={{ marginTop: "40px" }}>

            <h2>Currency Converter</h2>

            <input

                type="number"

                placeholder="Enter INR"

                value={rupees}

                onChange={(e) => setRupees(e.target.value)}

            />

            <button onClick={handleSubmit}>

                Convert

            </button>

            <h3>

                Euro : € {euro}

            </h3>

        </div>

    );

}

export default CurrencyConverter;