package Tests;

import Base.BaseTest;
import Pages.Onboarding;
import Pages.SignInClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FullOnboardAndSignInWithApple extends BaseTest {
    Onboarding onboarding;
    SignInClass signIn;

    @BeforeClass
    public void initObjects()throws InterruptedException{
        onboarding = new Onboarding(driver);
        signIn = onboarding.basicFullOnboarding();
    }

    @Test()
    public void signInWithApple()throws InterruptedException{
        signIn.signInWithApple();
    }

}
