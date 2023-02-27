package Tests;

import Base.BaseTest;
import Pages.Onboarding;
import Pages.OnboardingPrivacyClass;
import Pages.SignInClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FullOnboardingAndGoogleSignIn extends BaseTest {
    private OnboardingPrivacyClass privacy;
    private Onboarding onboarding;
    private SignInClass signIn;

    @BeforeClass
    public void initObjects()throws InterruptedException{
        onboarding = new Onboarding(driver);
        signIn = onboarding.basicFullOnboarding();
    }

    @Test()
    public void signInWithGoogle()throws InterruptedException{
        signIn.tapOnSignInWithGoogle();
    }
}
