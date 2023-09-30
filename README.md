# NewsApplication Using REST API

This Website provides free API just go to this website   

1. Register -> https://newsapi.org/
2. Click on **Get API key**
3. Paste the API key in string.xml.
4. Go to the top headlines and copy the link from the **GET** method.
5. Paste it in Postman https://www.postman.com/ -> my workspace -> history -> **GET**.

  **Now working in Android Studio**
1. activity_main.xml
2. healine_list_title.xml
3. Created a Model for response. 
4. CustomViewHolder.java which is the **Adapter** class.
5. CustomAdapter.java  || for loading images we are using -> https://github.com/square/picasso
7. For managing the request we will use the retrofit library -> https://github.com/square/retrofit
8. also we need a JSON converter for our retrofit https://github.com/square/retrofit/tree/master/retrofit-converters/gson
9. Calling and Managing the API calls in RequestManager.

    **If you are getting an error then add the dependencies of the same version**
       // Picasso
    implementation ("com.squareup.picasso:picasso:2.9.0")
    // RetroFit
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    // Json converter
    implementation ("com.squareup.retrofit2:converter-gson:2.9.0")

   
   
