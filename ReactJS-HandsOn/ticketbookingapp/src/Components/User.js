import React from "react";

function User() {

    return (

        <div>

            <h2>Welcome User</h2>

            <h3>Book Your Flight</h3>

            <table border="1" cellPadding="8">

                <thead>

                    <tr>
                        <th>Flight</th>
                        <th>Destination</th>
                        <th>Book</th>
                    </tr>

                </thead>

                <tbody>

                    <tr>
                        <td>AI101</td>
                        <td>Mumbai</td>
                        <td>
                            <button>Book</button>
                        </td>
                    </tr>

                    <tr>
                        <td>AI205</td>
                        <td>Chennai</td>
                        <td>
                            <button>Book</button>
                        </td>
                    </tr>

                    <tr>
                        <td>AI309</td>
                        <td>Kolkata</td>
                        <td>
                            <button>Book</button>
                        </td>
                    </tr>

                </tbody>

            </table>

        </div>

    );

}

export default User;