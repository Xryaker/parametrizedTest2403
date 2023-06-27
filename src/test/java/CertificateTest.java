import config.BaseClass;
import data.DataProvider;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.support.PageFactory;
import pages.CertificatePag;

import java.util.Collection;

@RunWith(Parameterized.class)
public class CertificateTest extends BaseClass {
    String number;
    CertificatePag cert;

    @Parameterized.Parameters
    public static Collection options() {
        return DataProvider.getCertNoValid();
    }

    public CertificateTest(String number) {
        this.number = number;
        driver.get("https://certificate.ithillel.ua/");
         cert= PageFactory.initElements(driver, CertificatePag.class);
    }

    @Test
    public void test1() throws Exception {
        cert.sendCertificate(number);
        Assert.assertFalse(cert.validationCertificate());
    }
}
