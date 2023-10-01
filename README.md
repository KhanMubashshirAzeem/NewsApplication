# NewsApplication Using REST API

  **Get new API link is mentioned below**
1. Register -> https://newsapi.org/
2. Click on **Get API key**
3. Paste the API key in string.xml.
4. Go to the top headlines and copy the link from the **GET** method.
5. Paste it in Postman https://www.postman.com/ -> my workspace -> history -> **GET**.

  **Now working in Android Studio**
1. **activity_main.xml**
2. **healine_list_title.xml**
3. Created a **Model** for a response. 
4. **CustomViewHolder.java** which is the **Adapter** class.
5. **CustomAdapter.java**
6. Use **Picasso Library** for loading images we are using -> https://github.com/square/picasso
7. For managing the request we will use the **retrofit library** -> https://github.com/square/retrofit
8. also we need a **JSON** converter for our retrofit https://github.com/square/retrofit/tree/master/retrofit-converters/gson
9. Calling and Managing the API calls in **RequestManager.Java**.

—-----------------------------------------------------------------------------------------------------------------------
  **If you are facing any error then add these dependencies of the same version** <br>
     // Picasso <br>
      implementation("com.squareup.picasso:picasso:2.9.0") <br>
      // Retrofit <br>
      implementation("com.squareup.retrofit2:retrofit:2.9.0") <br>
      // Json converter <br>
      implementation("com.squareup.retrofit2:converter-gson:2.9.0") <br>

—-----------------------------------------------------------------------------------------------------------------------

10. For handling responses from **MainActivity.java** we make **OnFetchDataListener.java** which will be the Interface class.
11. To manage our API calls, we use the RequestManager.java class and make a new method: **getNewsHeadlines**.
12. Go to the MainActivity.java class and create the **RequestManager.java** class object.
13. Add internet Permission in **AndroidManifest.xml**
14. **Congratulations** we are **successfully** getting the news articles in our application.

**When the user clicks on any article the complete News should display in a new Activity**
15. Make the **SelectListner.java** interface class and make the **OnNewsClicked** method.
16. To implement the OnNewsClicked method we go to **CustomAdapter.java** class
17. Now go to the **MainActivity.java** class and implement SelectListener.
18. We need a new **Activity** to display the complete news so we make **NewsDetailsActivity**.
19. Working in XML and .java of **NewsDetailsActivity**.


   


