import React from "react";
import CohortDetails from "./Components/CohortDetails";

function App() {

    return (

        <div style={{ textAlign: "center" }}>

            <h1>My Academy Dashboard</h1>

            <CohortDetails

                cohortName="Java FSE"

                startedOn="15-Jul-2026"

                status="Ongoing"

                coach="John"

                trainer="Smith"

            />

            <CohortDetails

                cohortName="React"

                startedOn="20-May-2026"

                status="Completed"

                coach="David"

                trainer="James"

            />

        </div>

    );

}

export default App;
