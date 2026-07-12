import React from "react";

function CourseDetails() {

    const courses = [

        "Java Full Stack",

        "React",

        "Spring Boot",

        "Microservices"

    ];

    return (

        <div>

            <h2>Course Details</h2>

            <ol>

                {

                    courses.map((course, index) => (

                        <li key={index}>

                            {course}

                        </li>

                    ))

                }

            </ol>

        </div>

    );

}

export default CourseDetails;