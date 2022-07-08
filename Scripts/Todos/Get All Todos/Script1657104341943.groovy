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

response = WS.sendRequestAndVerify(findTestObject('Todos/Get All Todos'))

WS.verifyResponseStatusCode(response, 200)
assertThat(response.getStatusCode()).isEqualTo(200)

def results = new groovy.json.JsonSlurper().parseText( response.getResponseBodyContent() )
assertThat(results.size()).isEqualTo(200)

WS.verifyElementPropertyValue(response, '[0].userId', 1)
WS.verifyElementPropertyValue(response, '[0].id', 1)
WS.verifyElementPropertyValue(response, '[0].title', 'delectus aut autem')
WS.verifyElementPropertyValue(response, '[0].completed', false)

WS.verifyElementPropertyValue(response, '[20].userId', 2)
WS.verifyElementPropertyValue(response, '[20].id', 21)
WS.verifyElementPropertyValue(response, '[20].title', 'suscipit repellat esse quibusdam voluptatem incidunt')
WS.verifyElementPropertyValue(response, '[20].completed', false)

WS.verifyElementPropertyValue(response, '[40].userId', 3)
WS.verifyElementPropertyValue(response, '[40].id', 41)
WS.verifyElementPropertyValue(response, '[40].title', 'aliquid amet impedit consequatur aspernatur placeat eaque fugiat suscipit')
WS.verifyElementPropertyValue(response, '[40].completed', false)

WS.verifyElementPropertyValue(response, '[60].userId', 4)
WS.verifyElementPropertyValue(response, '[60].id', 61)
WS.verifyElementPropertyValue(response, '[60].title', 'odit optio omnis qui sunt')
WS.verifyElementPropertyValue(response, '[60].completed', true)

WS.verifyElementPropertyValue(response, '[80].userId', 5)
WS.verifyElementPropertyValue(response, '[80].id', 81)
WS.verifyElementPropertyValue(response, '[80].title', 'suscipit qui totam')
WS.verifyElementPropertyValue(response, '[80].completed', true)

WS.verifyElementPropertyValue(response, '[100].userId', 6)
WS.verifyElementPropertyValue(response, '[100].id', 101)
WS.verifyElementPropertyValue(response, '[100].title', 'explicabo enim cumque porro aperiam occaecati minima')
WS.verifyElementPropertyValue(response, '[100].completed', false)

WS.verifyElementPropertyValue(response, '[120].userId', 7)
WS.verifyElementPropertyValue(response, '[120].id', 121)
WS.verifyElementPropertyValue(response, '[120].title', 'inventore aut nihil minima laudantium hic qui omnis')
WS.verifyElementPropertyValue(response, '[120].completed', true)

WS.verifyElementPropertyValue(response, '[140].userId', 8)
WS.verifyElementPropertyValue(response, '[140].id', 141)
WS.verifyElementPropertyValue(response, '[140].title', 'explicabo consectetur debitis voluptates quas quae culpa rerum non')
WS.verifyElementPropertyValue(response, '[140].completed', true)

WS.verifyElementPropertyValue(response, '[160].userId', 9)
WS.verifyElementPropertyValue(response, '[160].id', 161)
WS.verifyElementPropertyValue(response, '[160].title', 'ex hic consequuntur earum omnis alias ut occaecati culpa')
WS.verifyElementPropertyValue(response, '[160].completed', true)

WS.verifyElementPropertyValue(response, '[180].userId', 10)
WS.verifyElementPropertyValue(response, '[180].id', 181)
WS.verifyElementPropertyValue(response, '[180].title', 'ut cupiditate sequi aliquam fuga maiores')
WS.verifyElementPropertyValue(response, '[180].completed', false)