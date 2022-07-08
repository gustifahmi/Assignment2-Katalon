import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static org.assertj.core.api.Assertions.*
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

response = WS.sendRequestAndVerify(findTestObject('Albums/Get All Albums'))

WS.verifyResponseStatusCode(response, 200)

assertThat(response.getStatusCode()).isEqualTo(200)

def results = new groovy.json.JsonSlurper().parseText(response.getResponseBodyContent())

assertThat(results.size()).isEqualTo(100)

WS.verifyElementPropertyValue(response, '[0].userId', 1)

WS.verifyElementPropertyValue(response, '[0].id', 1)

WS.verifyElementPropertyValue(response, '[0].title', 'quidem molestiae enim')

WS.verifyElementPropertyValue(response, '[10].userId', 2)

WS.verifyElementPropertyValue(response, '[10].id', 11)

WS.verifyElementPropertyValue(response, '[10].title', 'quam nostrum impedit mollitia quod et dolor')

WS.verifyElementPropertyValue(response, '[20].userId', 3)

WS.verifyElementPropertyValue(response, '[20].id', 21)

WS.verifyElementPropertyValue(response, '[20].title', 'repudiandae voluptatem optio est consequatur rem in temporibus et')

WS.verifyElementPropertyValue(response, '[30].userId', 4)

WS.verifyElementPropertyValue(response, '[30].id', 31)

WS.verifyElementPropertyValue(response, '[30].title', 'adipisci laborum fuga laboriosam')

WS.verifyElementPropertyValue(response, '[40].userId', 5)

WS.verifyElementPropertyValue(response, '[40].id', 41)

WS.verifyElementPropertyValue(response, '[40].title', 'ea voluptates maiores eos accusantium officiis tempore mollitia consequatur')

WS.verifyElementPropertyValue(response, '[50].userId', 6)

WS.verifyElementPropertyValue(response, '[50].id', 51)

WS.verifyElementPropertyValue(response, '[50].title', 'odit laboriosam sint quia cupiditate animi quis')

WS.verifyElementPropertyValue(response, '[60].userId', 7)

WS.verifyElementPropertyValue(response, '[60].id', 61)

WS.verifyElementPropertyValue(response, '[60].title', 'delectus iusto et')

WS.verifyElementPropertyValue(response, '[70].userId', 8)

WS.verifyElementPropertyValue(response, '[70].id', 71)

WS.verifyElementPropertyValue(response, '[70].title', 'et vel corporis')

WS.verifyElementPropertyValue(response, '[80].userId', 9)

WS.verifyElementPropertyValue(response, '[80].id', 81)

WS.verifyElementPropertyValue(response, '[80].title', 'quibusdam sapiente et')

WS.verifyElementPropertyValue(response, '[90].userId', 10)

WS.verifyElementPropertyValue(response, '[90].id', 91)

WS.verifyElementPropertyValue(response, '[90].title', 'repellendus praesentium debitis officiis')

