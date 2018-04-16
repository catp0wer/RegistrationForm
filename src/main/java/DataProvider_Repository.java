

import org.testng.annotations.DataProvider;

public class DataProvider_Repository {


    @DataProvider(name="LogInData")
    public static Object[][] LogInCaseData(){
        return new Object[][]
                {
                        { "Test1","" },
                        { "Test2", "Test" },
                        { "Test3", "Test2" }

                };


    }
}
