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

response = WS.sendRequestAndVerify(findTestObject('Users/Create New User'))

WS.verifyResponseStatusCode(response, 201)
assertThat(response.getStatusCode()).isEqualTo(201)

WS.verifyElementPropertyValue(response, 'name', 'John Doe')
WS.verifyElementPropertyValue(response, 'username', 'Jojon')
WS.verifyElementPropertyValue(response, 'email', 'jojon@example.com')
WS.verifyElementPropertyValue(response, 'address.street', 'Grove Street')
WS.verifyElementPropertyValue(response, 'address.suite', 'Apt. 666')
WS.verifyElementPropertyValue(response, 'address.city', 'Bekasi')
WS.verifyElementPropertyValue(response, 'address.zipcode', '14045')
WS.verifyElementPropertyValue(response, 'address.geo.lat', '-99.9999')
WS.verifyElementPropertyValue(response, 'address.geo.lng', '88.8888')
WS.verifyElementPropertyValue(response, 'phone', '021-1111111')
WS.verifyElementPropertyValue(response, 'website', 'example.com')
WS.verifyElementPropertyValue(response, 'company.name', 'Makmur Jaya')
WS.verifyElementPropertyValue(response, 'company.catchPhrase', 'Test create user')
WS.verifyElementPropertyValue(response, 'company.bs', 'Test create user')
WS.verifyElementPropertyValue(response, 'id', 11)