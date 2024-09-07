Building a News Application Using REST API

=========  **Complete Steps for Implementing the Application**  ==========

## Output: https://www.linkedin.com/feed/update/urn:li:activity:7118079371315167233/

Step 1: Get the API Key

Register on newsapi.org.
Click on "Get API key" and obtain your API key.
Paste the API key in your strings.xml resource file.

Step 2: Testing the API
Go to the top headlines section and copy the link from the GET method.
Use a tool like Postman to paste the link and make a GET request to test the API.
Setting Up Android Studio

Step 3: Project Setup

Create an activity_main.xml layout.
Create a headline_list_title.xml layout.
Define a model class to represent the API response.
Implement a CustomViewHolder class for your RecyclerView adapter.
Create a CustomAdapter class for your RecyclerView.
Utilize the Picasso library for image loading.
Use the Retrofit library for managing API requests.
Add the JSON converter for Retrofit.

Step 4: Dependencies

Ensure you have these dependencies with the same version:

// Picasso: Images loading

implementation("com.squareup.picasso:picasso:2.9.0")

// Retrofit: Networking Library

implementation("com.squareup.retrofit2:retrofit:2.9.0")

// JSON converter
implementation("com.squareup.retrofit2:converter-gson:2.9.0")

Step 5: Handling API Responses

Create an OnFetchDataListener interface for handling API responses.
Implement the RequestManager.java class to manage API calls.

Step 6: Making API Calls

Implement the getNewsHeadlines method in RequestManager.java.

Step 7: MainActivity Setup

In the MainActivity.java class, create an instance of RequestManager.java.
Add internet permission in your AndroidManifest.xml.

Step 8: Displaying News Details

Create a SelectListener.java interface with an OnNewsClicked method.
Implement the OnNewsClicked method in the CustomAdapter.java class.
In the MainActivity.java class, implement the SelectListener interface.

Step 9: NewsDetailsActivity Setup

Create a new activity, NewsDetailsActivity, to display complete news articles.
Work on the XML and Java files for NewsDetailsActivity.

step 10: Implement Categories in the MainActivity Activity.

Implement View OnClickListener and method OnClick Method.


Conclusion: Congratulations! You've successfully built a news application using a REST API in Android Studio. This guide covers setting up the API, using libraries for image loading and API requests, handling responses, and displaying news articles with complete details.
