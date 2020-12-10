import java.io.FileInputStream;

public class Firebase {
    public void Initialize(){
        try{
            FileInputStream serviceAccount = new FileInputStream("./");
            FirebaseOptions options = new FirebaseOptions.Builder()
                    .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                    .setDatabaseUrl("https://superleads-578d0.firebaseio.com")
                    .build();
            System.out.println("Firebase working");
            FirebaseApp.initializeApp(options);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
