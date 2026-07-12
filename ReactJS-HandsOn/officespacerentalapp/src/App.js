import React from "react";

function App() {

  const office = {
    name: "Skyline Business Park",
    rent: 55000,
    address: "MG Road, Bengaluru"
  };

  const officeList = [
    {
      id: 1,
      name: "Skyline Business Park",
      rent: 55000,
      address: "MG Road, Bengaluru"
    },
    {
      id: 2,
      name: "Tech Hub",
      rent: 75000,
      address: "Whitefield, Bengaluru"
    },
    {
      id: 3,
      name: "Corporate Tower",
      rent: 62000,
      address: "Electronic City, Bengaluru"
    }
  ];

  return (
    <div style={{ padding: "20px" }}>

      <h1>Office Space Rental App</h1>

      <img
        src="/office.jpeg"
        alt="Office"
        width="500"
      />

      <h2>Featured Office</h2>

      <p><b>Name:</b> {office.name}</p>

      <p
        style={{
          color: office.rent < 60000 ? "red" : "green"
        }}
      >
        <b>Rent:</b> ₹{office.rent}
      </p>

      <p><b>Address:</b> {office.address}</p>

      <hr />

      <h2>Available Office Spaces</h2>

      {
        officeList.map((item) => (

          <div
            key={item.id}
            style={{
              border: "1px solid gray",
              margin: "15px",
              padding: "15px",
              borderRadius: "10px"
            }}
          >

            <h3>{item.name}</h3>

            <p
              style={{
                color: item.rent < 60000 ? "red" : "green"
              }}
            >
              Rent: ₹{item.rent}
            </p>

            <p>{item.address}</p>

          </div>

        ))
      }

    </div>
  );
}

export default App;
