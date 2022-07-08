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

response = WS.sendRequestAndVerify(findTestObject('Photos/Get All Photos'))

WS.verifyResponseStatusCode(response, 200)
assertThat(response.getStatusCode()).isEqualTo(200)

def results = new groovy.json.JsonSlurper().parseText( response.getResponseBodyContent() )
assertThat(results.size()).isEqualTo(5000)

WS.verifyElementPropertyValue(response, '[0].albumId', 1)
WS.verifyElementPropertyValue(response, '[0].id', 1)
WS.verifyElementPropertyValue(response, '[0].title', 'accusamus beatae ad facilis cum similique qui sunt')
WS.verifyElementPropertyValue(response, '[0].url', 'https://via.placeholder.com/600/92c952')
WS.verifyElementPropertyValue(response, '[0].thumbnailUrl', 'https://via.placeholder.com/150/92c952')

WS.verifyElementPropertyValue(response, '[50].albumId', 2)
WS.verifyElementPropertyValue(response, '[50].id', 51)
WS.verifyElementPropertyValue(response, '[50].title', 'non sunt voluptatem placeat consequuntur rem incidunt')
WS.verifyElementPropertyValue(response, '[50].url', 'https://via.placeholder.com/600/8e973b')
WS.verifyElementPropertyValue(response, '[50].thumbnailUrl', 'https://via.placeholder.com/150/8e973b')

WS.verifyElementPropertyValue(response, '[100].albumId', 3)
WS.verifyElementPropertyValue(response, '[100].id', 101)
WS.verifyElementPropertyValue(response, '[100].title', 'incidunt alias vel enim')
WS.verifyElementPropertyValue(response, '[100].url', 'https://via.placeholder.com/600/e743b')
WS.verifyElementPropertyValue(response, '[100].thumbnailUrl', 'https://via.placeholder.com/150/e743b')

WS.verifyElementPropertyValue(response, '[150].albumId', 4)
WS.verifyElementPropertyValue(response, '[150].id', 151)
WS.verifyElementPropertyValue(response, '[150].title', 'possimus dolor minima provident ipsam')
WS.verifyElementPropertyValue(response, '[150].url', 'https://via.placeholder.com/600/1d2ad4')
WS.verifyElementPropertyValue(response, '[150].thumbnailUrl', 'https://via.placeholder.com/150/1d2ad4')

WS.verifyElementPropertyValue(response, '[200].albumId', 5)
WS.verifyElementPropertyValue(response, '[200].id', 201)
WS.verifyElementPropertyValue(response, '[200].title', 'nesciunt dolorum consequatur ullam tempore accusamus debitis sit')
WS.verifyElementPropertyValue(response, '[200].url', 'https://via.placeholder.com/600/250289')
WS.verifyElementPropertyValue(response, '[200].thumbnailUrl', 'https://via.placeholder.com/150/250289')

WS.verifyElementPropertyValue(response, '[250].albumId', 6)
WS.verifyElementPropertyValue(response, '[250].id', 251)
WS.verifyElementPropertyValue(response, '[250].title', 'voluptatibus nihil a')
WS.verifyElementPropertyValue(response, '[250].url', 'https://via.placeholder.com/600/afc5c2')
WS.verifyElementPropertyValue(response, '[250].thumbnailUrl', 'https://via.placeholder.com/150/afc5c2')

WS.verifyElementPropertyValue(response, '[300].albumId', 7)
WS.verifyElementPropertyValue(response, '[300].id', 301)
WS.verifyElementPropertyValue(response, '[300].title', 'aspernatur est omnis qui laudantium illo in laborum dolore')
WS.verifyElementPropertyValue(response, '[300].url', 'https://via.placeholder.com/600/92ce9a')
WS.verifyElementPropertyValue(response, '[300].thumbnailUrl', 'https://via.placeholder.com/150/92ce9a')

WS.verifyElementPropertyValue(response, '[350].albumId', 8)
WS.verifyElementPropertyValue(response, '[350].id', 351)
WS.verifyElementPropertyValue(response, '[350].title', 'molestias debitis cum')
WS.verifyElementPropertyValue(response, '[350].url', 'https://via.placeholder.com/600/9ae7cb')
WS.verifyElementPropertyValue(response, '[350].thumbnailUrl', 'https://via.placeholder.com/150/9ae7cb')

WS.verifyElementPropertyValue(response, '[400].albumId', 9)
WS.verifyElementPropertyValue(response, '[400].id', 401)
WS.verifyElementPropertyValue(response, '[400].title', 'vitae et cumque velit repellat eaque')
WS.verifyElementPropertyValue(response, '[400].url', 'https://via.placeholder.com/600/9f134c')
WS.verifyElementPropertyValue(response, '[400].thumbnailUrl', 'https://via.placeholder.com/150/9f134c')

WS.verifyElementPropertyValue(response, '[450].albumId', 10)
WS.verifyElementPropertyValue(response, '[450].id', 451)
WS.verifyElementPropertyValue(response, '[450].title', 'dolorem accusantium corrupti incidunt quas ex est')
WS.verifyElementPropertyValue(response, '[450].url', 'https://via.placeholder.com/600/5e912a')
WS.verifyElementPropertyValue(response, '[450].thumbnailUrl', 'https://via.placeholder.com/150/5e912a')