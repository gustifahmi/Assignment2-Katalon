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

response = WS.sendRequestAndVerify(findTestObject('Albums/Get All Albums By User Id'))

WS.verifyResponseStatusCode(response, 200)
assertThat(response.getStatusCode()).isEqualTo(200)

def results = new groovy.json.JsonSlurper().parseText( response.getResponseBodyContent() )
assertThat(results.size()).isEqualTo(10)

WS.verifyElementPropertyValue(response, '[0].userId', 1)
WS.verifyElementPropertyValue(response, '[0].id', 1)
WS.verifyElementPropertyValue(response, '[0].title', 'quidem molestiae enim')

WS.verifyElementPropertyValue(response, '[1].userId', 1)
WS.verifyElementPropertyValue(response, '[1].id', 2)
WS.verifyElementPropertyValue(response, '[1].title', 'sunt qui excepturi placeat culpa')

WS.verifyElementPropertyValue(response, '[2].userId', 1)
WS.verifyElementPropertyValue(response, '[2].id', 3)
WS.verifyElementPropertyValue(response, '[2].title', 'omnis laborum odio')

WS.verifyElementPropertyValue(response, '[3].userId', 1)
WS.verifyElementPropertyValue(response, '[3].id', 4)
WS.verifyElementPropertyValue(response, '[3].title', 'non esse culpa molestiae omnis sed optio')

WS.verifyElementPropertyValue(response, '[4].userId', 1)
WS.verifyElementPropertyValue(response, '[4].id', 5)
WS.verifyElementPropertyValue(response, '[4].title', 'eaque aut omnis a')

WS.verifyElementPropertyValue(response, '[5].userId', 1)
WS.verifyElementPropertyValue(response, '[5].id', 6)
WS.verifyElementPropertyValue(response, '[5].title', 'natus impedit quibusdam illo est')

WS.verifyElementPropertyValue(response, '[6].userId', 1)
WS.verifyElementPropertyValue(response, '[6].id', 7)
WS.verifyElementPropertyValue(response, '[6].title', 'quibusdam autem aliquid et et quia')

WS.verifyElementPropertyValue(response, '[7].userId', 1)
WS.verifyElementPropertyValue(response, '[7].id', 8)
WS.verifyElementPropertyValue(response, '[7].title', 'qui fuga est a eum')

WS.verifyElementPropertyValue(response, '[8].userId', 1)
WS.verifyElementPropertyValue(response, '[8].id', 9)
WS.verifyElementPropertyValue(response, '[8].title', 'saepe unde necessitatibus rem')

WS.verifyElementPropertyValue(response, '[9].userId', 1)
WS.verifyElementPropertyValue(response, '[9].id', 10)
WS.verifyElementPropertyValue(response, '[9].title', 'distinctio laborum qui')