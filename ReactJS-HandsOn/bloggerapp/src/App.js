import React from "react";

import BookDetails from "./Components/BookDetails";
import BlogDetails from "./Components/BlogDetails";
import CourseDetails from "./Components/CourseDetails";

function App() {

    const showBooks = true;
    const showBlogs = true;
    const showCourses = true;

    return (

        <div
            style={{
                margin: "30px"
            }}
        >

            <h1>Blogger App</h1>

            {showBooks && <BookDetails />}

            {showBlogs ? <BlogDetails /> : <h3>No Blogs Available</h3>}

            {showCourses ? <CourseDetails /> : null}

        </div>

    );

}

export default App;