Jokes that make you cringe delivered straight from the cloud.
====

##Components : 
[Android App](https://github.com/the-dagger/PoorJoker/tree/master/app) : Consisting of free and paid components with and without Ads respectively.<br>
[Java Library](https://github.com/the-dagger/PoorJoker/tree/master/lib) : Library that supplies jokes to the App.<br>
[Google Cloud Engine Server](https://github.com/the-dagger/PoorJoker/tree/master/backend) : Backend server which fetches jokes from the java library.<br>
This also provides an endpoint for the Android app to fetch jokes from.<br>
[Android Library](https://github.com/the-dagger/PoorJoker/tree/master/jokelib) : Opens up an Activity which displays joke fetched from the backend server.<br>

##Setting up : 
Clone the repo and import the whole directory in Android Studio.<br>
Choose the `Backend` module and deploy it to your own google cloud engine.<br>
**(Optional)** Replace the existing API URL in `MainActivityFragment.java` in both paid and free variants to reference to your newly deployed module.

##Add your own Joke : 
Add your jokes to [JokeTeller.java](https://github.com/the-dagger/PoorJoker/blob/master/lib/src/main/java/com/example/JokeTeller.java) and send a Pull Request.

##This Project was made as a part of Udacity's Android Developer Nanodegree.
