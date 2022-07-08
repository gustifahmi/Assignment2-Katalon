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

response = WS.sendRequestAndVerify(findTestObject('Posts/Get All Posts'))

WS.verifyResponseStatusCode(response, 200)

assertThat(response.getStatusCode()).isEqualTo(200)

def results = new groovy.json.JsonSlurper().parseText(response.getResponseBodyContent())

assertThat(results.size()).isEqualTo(100)

WS.verifyElementPropertyValue(response, '[0].userId', 1)

WS.verifyElementPropertyValue(response, '[0].id', 1)

WS.verifyElementPropertyValue(response, '[0].title', 'sunt aut facere repellat provident occaecati excepturi optio reprehenderit')

WS.verifyElementPropertyValue(response, '[0].body', 'quia et suscipit\nsuscipit recusandae consequuntur expedita et cum\nreprehenderit molestiae ut ut quas totam\nnostrum rerum est autem sunt rem eveniet architecto')

WS.verifyElementPropertyValue(response, '[10].userId', 2)

WS.verifyElementPropertyValue(response, '[10].id', 11)

WS.verifyElementPropertyValue(response, '[10].title', 'et ea vero quia laudantium autem')

WS.verifyElementPropertyValue(response, '[10].body', 'delectus reiciendis molestiae occaecati non minima eveniet qui voluptatibus\naccusamus in eum beatae sit\nvel qui neque voluptates ut commodi qui incidunt\nut animi commodi')

WS.verifyElementPropertyValue(response, '[20].userId', 3)

WS.verifyElementPropertyValue(response, '[20].id', 21)

WS.verifyElementPropertyValue(response, '[20].title', 'asperiores ea ipsam voluptatibus modi minima quia sint')

WS.verifyElementPropertyValue(response, '[20].body', 'repellat aliquid praesentium dolorem quo\nsed totam minus non itaque\nnihil labore molestiae sunt dolor eveniet hic recusandae veniam\ntempora et tenetur expedita sunt')

WS.verifyElementPropertyValue(response, '[30].userId', 4)

WS.verifyElementPropertyValue(response, '[30].id', 31)

WS.verifyElementPropertyValue(response, '[30].title', 'ullam ut quidem id aut vel consequuntur')

WS.verifyElementPropertyValue(response, '[30].body', 'debitis eius sed quibusdam non quis consectetur vitae\nimpedit ut qui consequatur sed aut in\nquidem sit nostrum et maiores adipisci atque\nquaerat voluptatem adipisci repudiandae')

WS.verifyElementPropertyValue(response, '[40].userId', 5)

WS.verifyElementPropertyValue(response, '[40].id', 41)

WS.verifyElementPropertyValue(response, '[40].title', 'non est facere')

WS.verifyElementPropertyValue(response, '[40].body', 'molestias id nostrum\nexcepturi molestiae dolore omnis repellendus quaerat saepe\nconsectetur iste quaerat tenetur asperiores accusamus ex ut\nnam quidem est ducimus sunt debitis saepe')

WS.verifyElementPropertyValue(response, '[50].userId', 6)

WS.verifyElementPropertyValue(response, '[50].id', 51)

WS.verifyElementPropertyValue(response, '[50].title', 'soluta aliquam aperiam consequatur illo quis voluptas')

WS.verifyElementPropertyValue(response, '[50].body', 'sunt dolores aut doloribus\ndolore doloribus voluptates tempora et\ndoloremque et quo\ncum asperiores sit consectetur dolorem')

WS.verifyElementPropertyValue(response, '[60].userId', 7)

WS.verifyElementPropertyValue(response, '[60].id', 61)

WS.verifyElementPropertyValue(response, '[60].title', 'voluptatem doloribus consectetur est ut ducimus')

WS.verifyElementPropertyValue(response, '[60].body', 'ab nemo optio odio\ndelectus tenetur corporis similique nobis repellendus rerum omnis facilis\nvero blanditiis debitis in nesciunt doloribus dicta dolores\nmagnam minus velit')

WS.verifyElementPropertyValue(response, '[70].userId', 8)

WS.verifyElementPropertyValue(response, '[70].id', 71)

WS.verifyElementPropertyValue(response, '[70].title', 'et iusto veniam et illum aut fuga')

WS.verifyElementPropertyValue(response, '[70].body', 'occaecati a doloribus\niste saepe consectetur placeat eum voluptate dolorem et\nqui quo quia voluptas\nrerum ut id enim velit est perferendis')

WS.verifyElementPropertyValue(response, '[80].userId', 9)

WS.verifyElementPropertyValue(response, '[80].id', 81)

WS.verifyElementPropertyValue(response, '[80].title', 'tempora rem veritatis voluptas quo dolores vero')

WS.verifyElementPropertyValue(response, '[80].body', 'facere qui nesciunt est voluptatum voluptatem nisi\nsequi eligendi necessitatibus ea at rerum itaque\nharum non ratione velit laboriosam quis consequuntur\nex officiis minima doloremque voluptas ut aut')

WS.verifyElementPropertyValue(response, '[90].userId', 10)

WS.verifyElementPropertyValue(response, '[90].id', 91)

WS.verifyElementPropertyValue(response, '[90].title', 'aut amet sed')

WS.verifyElementPropertyValue(response, '[90].body', 'libero voluptate eveniet aperiam sed\nsunt placeat suscipit molestias\nsimilique fugit nam natus\nexpedita consequatur consequatur dolores quia eos et placeat')

