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

response = WS.sendRequestAndVerify(findTestObject('Photos/Get All Photos By Album Id'))

WS.verifyResponseStatusCode(response, 200)
assertThat(response.getStatusCode()).isEqualTo(200)

def results = new groovy.json.JsonSlurper().parseText( response.getResponseBodyContent() )
assertThat(results.size()).isEqualTo(50)

WS.verifyElementPropertyValue(response, '[0].albumId', 1)
WS.verifyElementPropertyValue(response, '[0].id', 1)
WS.verifyElementPropertyValue(response, '[0].title', 'accusamus beatae ad facilis cum similique qui sunt')
WS.verifyElementPropertyValue(response, '[0].url', 'https://via.placeholder.com/600/92c952')
WS.verifyElementPropertyValue(response, '[0].thumbnailUrl', 'https://via.placeholder.com/150/92c952')

WS.verifyElementPropertyValue(response, '[1].albumId', 1)
WS.verifyElementPropertyValue(response, '[1].id', 2)
WS.verifyElementPropertyValue(response, '[1].title', 'reprehenderit est deserunt velit ipsam')
WS.verifyElementPropertyValue(response, '[1].url', 'https://via.placeholder.com/600/771796')
WS.verifyElementPropertyValue(response, '[1].thumbnailUrl', 'https://via.placeholder.com/150/771796')

WS.verifyElementPropertyValue(response, '[2].albumId', 1)
WS.verifyElementPropertyValue(response, '[2].id', 3)
WS.verifyElementPropertyValue(response, '[2].title', 'officia porro iure quia iusto qui ipsa ut modi')
WS.verifyElementPropertyValue(response, '[2].url', 'https://via.placeholder.com/600/24f355')
WS.verifyElementPropertyValue(response, '[2].thumbnailUrl', 'https://via.placeholder.com/150/24f355')

WS.verifyElementPropertyValue(response, '[3].albumId', 1)
WS.verifyElementPropertyValue(response, '[3].id', 4)
WS.verifyElementPropertyValue(response, '[3].title', 'culpa odio esse rerum omnis laboriosam voluptate repudiandae')
WS.verifyElementPropertyValue(response, '[3].url', 'https://via.placeholder.com/600/d32776')
WS.verifyElementPropertyValue(response, '[3].thumbnailUrl', 'https://via.placeholder.com/150/d32776')

WS.verifyElementPropertyValue(response, '[4].albumId', 1)
WS.verifyElementPropertyValue(response, '[4].id', 5)
WS.verifyElementPropertyValue(response, '[4].title', 'natus nisi omnis corporis facere molestiae rerum in')
WS.verifyElementPropertyValue(response, '[4].url', 'https://via.placeholder.com/600/f66b97')
WS.verifyElementPropertyValue(response, '[4].thumbnailUrl', 'https://via.placeholder.com/150/f66b97')

WS.verifyElementPropertyValue(response, '[5].albumId', 1)
WS.verifyElementPropertyValue(response, '[5].id', 6)
WS.verifyElementPropertyValue(response, '[5].title', 'accusamus ea aliquid et amet sequi nemo')
WS.verifyElementPropertyValue(response, '[5].url', 'https://via.placeholder.com/600/56a8c2')
WS.verifyElementPropertyValue(response, '[5].thumbnailUrl', 'https://via.placeholder.com/150/56a8c2')

WS.verifyElementPropertyValue(response, '[6].albumId', 1)
WS.verifyElementPropertyValue(response, '[6].id', 7)
WS.verifyElementPropertyValue(response, '[6].title', 'officia delectus consequatur vero aut veniam explicabo molestias')
WS.verifyElementPropertyValue(response, '[6].url', 'https://via.placeholder.com/600/b0f7cc')
WS.verifyElementPropertyValue(response, '[6].thumbnailUrl', 'https://via.placeholder.com/150/b0f7cc')

WS.verifyElementPropertyValue(response, '[7].albumId', 1)
WS.verifyElementPropertyValue(response, '[7].id', 8)
WS.verifyElementPropertyValue(response, '[7].title', 'aut porro officiis laborum odit ea laudantium corporis')
WS.verifyElementPropertyValue(response, '[7].url', 'https://via.placeholder.com/600/54176f')
WS.verifyElementPropertyValue(response, '[7].thumbnailUrl', 'https://via.placeholder.com/150/54176f')

WS.verifyElementPropertyValue(response, '[8].albumId', 1)
WS.verifyElementPropertyValue(response, '[8].id', 9)
WS.verifyElementPropertyValue(response, '[8].title', 'qui eius qui autem sed')
WS.verifyElementPropertyValue(response, '[8].url', 'https://via.placeholder.com/600/51aa97')
WS.verifyElementPropertyValue(response, '[8].thumbnailUrl', 'https://via.placeholder.com/150/51aa97')

WS.verifyElementPropertyValue(response, '[9].albumId', 1)
WS.verifyElementPropertyValue(response, '[9].id', 10)
WS.verifyElementPropertyValue(response, '[9].title', 'beatae et provident et ut vel')
WS.verifyElementPropertyValue(response, '[9].url', 'https://via.placeholder.com/600/810b14')
WS.verifyElementPropertyValue(response, '[9].thumbnailUrl', 'https://via.placeholder.com/150/810b14')