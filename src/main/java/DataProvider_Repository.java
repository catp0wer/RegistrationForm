

import org.testng.annotations.DataProvider;

public class DataProvider_Repository {


    @DataProvider(name="LogInData")
    public static Object[][] LogInCaseData(){
        return new Object[][]
                {
                        //firtsname, lastName,maritalStatus,Hobby, Country,Month,day,Year,Phone number, username,
                        //Email,About Yourself, pass, Confirm pass
                        { "Testaut3","Testaut3","","Reading","Brunei","3","2","2005" ,"1234567899","testaut3",
                               "testaut3@gmail.com","I am test1","test1test1","test1test1","Thank you for your registration"},
                      //  { "Testaut100", "Testaut100","","Dance","Moldova","3","5","2005","1111111111","testaut100",
                      //      "testaut100@gmail.com","","test2test2","test2test2","Thank you for your registration"},
                      //  { "Test3", "Test3","Single","Cricket","Moldova","1","1","2000","2222222222","test3",
                        // "test3@gmail.com","I am test3","test3","test3"}

                };
    }
}
