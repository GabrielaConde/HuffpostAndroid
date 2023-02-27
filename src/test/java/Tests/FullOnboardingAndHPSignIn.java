package Tests;

import Base.BaseTest;
import Pages.Onboarding;
import Pages.OnboardingPrivacyClass;
import Pages.SignInClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FullOnboardingAndHPSignIn extends BaseTest {
    private OnboardingPrivacyClass privacy;
    private Onboarding onboarding;
    private SignInClass signIn;


    @BeforeClass
    public void initObjects()throws InterruptedException{
        onboarding = new Onboarding(driver);
        signIn = onboarding.basicFullOnboarding();
    }

    @Test()
    public void signInWithHPAccount()throws InterruptedException{
     //   signIn.signInWithHPAccount("g.abitacon56@gmail.com", "sanfer12");
        signIn.inputTextOnTextElements("g.abitacon56@gmail.com", "sanfer12", "Mellie", "Linch");
    }
}
