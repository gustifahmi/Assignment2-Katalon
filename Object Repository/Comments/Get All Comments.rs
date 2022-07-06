<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Get All Comments</name>
   <tag></tag>
   <elementGuidId>d99b4d94-a4a8-4b1d-9a2a-0365950b0161</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>0</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent></httpBodyContent>
   <httpBodyType></httpBodyType>
   <katalonVersion>8.3.5</katalonVersion>
   <maxResponseSize>0</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>GET</restRequestMethod>
   <restUrl>http://jsonplaceholder.typicode.com/comments</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>0</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()
ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()

WS.verifyResponseStatusCode(response, 200)
assertThat(response.getStatusCode()).isEqualTo(200)

def results = new groovy.json.JsonSlurper().parseText( response.getResponseBodyContent() )
assertThat(results.size()).isEqualTo(500)

WS.verifyElementPropertyValue(response, '[0].postId', 1)
WS.verifyElementPropertyValue(response, '[0].id', 1)
WS.verifyElementPropertyValue(response, '[0].name', 'id labore ex et quam laborum')
WS.verifyElementPropertyValue(response, '[0].email', 'Eliseo@gardner.biz')
WS.verifyElementPropertyValue(response, '[0].body', 'laudantium enim quasi est quidem magnam voluptate ipsam eos\ntempora quo necessitatibus\ndolor quam autem quasi\nreiciendis et nam sapiente accusantium')

WS.verifyElementPropertyValue(response, '[5].postId', 2)
WS.verifyElementPropertyValue(response, '[5].id', 6)
WS.verifyElementPropertyValue(response, '[5].name', 'et fugit eligendi deleniti quidem qui sint nihil autem')
WS.verifyElementPropertyValue(response, '[5].email', 'Presley.Mueller@myrl.com')
WS.verifyElementPropertyValue(response, '[5].body', 'doloribus at sed quis culpa deserunt consectetur qui praesentium\naccusamus fugiat dicta\nvoluptatem rerum ut voluptate autem\nvoluptatem repellendus aspernatur dolorem in')

WS.verifyElementPropertyValue(response, '[10].postId', 3)
WS.verifyElementPropertyValue(response, '[10].id', 11)
WS.verifyElementPropertyValue(response, '[10].name', 'fugit labore quia mollitia quas deserunt nostrum sunt')
WS.verifyElementPropertyValue(response, '[10].email', 'Veronica_Goodwin@timmothy.net')
WS.verifyElementPropertyValue(response, '[10].body', 'ut dolorum nostrum id quia aut est\nfuga est inventore vel eligendi explicabo quis consectetur\naut occaecati repellat id natus quo est\nut blanditiis quia ut vel ut maiores ea')

WS.verifyElementPropertyValue(response, '[15].postId', 4)
WS.verifyElementPropertyValue(response, '[15].id', 16)
WS.verifyElementPropertyValue(response, '[15].name', 'perferendis temporibus delectus optio ea eum ratione dolorum')
WS.verifyElementPropertyValue(response, '[15].email', 'Christine@ayana.info')
WS.verifyElementPropertyValue(response, '[15].body', 'iste ut laborum aliquid velit facere itaque\nquo ut soluta dicta voluptate\nerror tempore aut et\nsequi reiciendis dignissimos expedita consequuntur libero sed fugiat facilis')

WS.verifyElementPropertyValue(response, '[20].postId', 5)
WS.verifyElementPropertyValue(response, '[20].id', 21)
WS.verifyElementPropertyValue(response, '[20].name', 'aliquid rerum mollitia qui a consectetur eum sed')
WS.verifyElementPropertyValue(response, '[20].email', 'Noemie@marques.me')
WS.verifyElementPropertyValue(response, '[20].body', 'deleniti aut sed molestias explicabo\ncommodi odio ratione nesciunt\nvoluptate doloremque est\nnam autem error delectus')

WS.verifyElementPropertyValue(response, '[25].postId', 6)
WS.verifyElementPropertyValue(response, '[25].id', 26)
WS.verifyElementPropertyValue(response, '[25].name', 'in deleniti sunt provident soluta ratione veniam quam praesentium')
WS.verifyElementPropertyValue(response, '[25].email', 'Russel.Parker@kameron.io')
WS.verifyElementPropertyValue(response, '[25].body', 'incidunt sapiente eaque dolor eos\nad est molestias\nquas sit et nihil exercitationem at cumque ullam\nnihil magnam et')

WS.verifyElementPropertyValue(response, '[30].postId', 7)
WS.verifyElementPropertyValue(response, '[30].id', 31)
WS.verifyElementPropertyValue(response, '[30].name', 'ex velit ut cum eius odio ad placeat')
WS.verifyElementPropertyValue(response, '[30].email', 'Buford@shaylee.biz')
WS.verifyElementPropertyValue(response, '[30].body', 'quia incidunt ut\naliquid est ut rerum deleniti iure est\nipsum quia ea sint et\nvoluptatem quaerat eaque repudiandae eveniet aut')

WS.verifyElementPropertyValue(response, '[35].postId', 8)
WS.verifyElementPropertyValue(response, '[35].id', 36)
WS.verifyElementPropertyValue(response, '[35].name', 'sit et quis')
WS.verifyElementPropertyValue(response, '[35].email', 'Raheem_Heaney@gretchen.biz')
WS.verifyElementPropertyValue(response, '[35].body', 'aut vero est\ndolor non aut excepturi dignissimos illo nisi aut quas\naut magni quia nostrum provident magnam quas modi maxime\nvoluptatem et molestiae')

WS.verifyElementPropertyValue(response, '[40].postId', 9)
WS.verifyElementPropertyValue(response, '[40].id', 41)
WS.verifyElementPropertyValue(response, '[40].name', 'voluptas deleniti ut')
WS.verifyElementPropertyValue(response, '[40].email', 'Lucio@gladys.tv')
WS.verifyElementPropertyValue(response, '[40].body', 'facere repudiandae vitae ea aut sed quo ut et\nfacere nihil ut voluptates in\nsaepe cupiditate accusantium numquam dolores\ninventore sint mollitia provident')

WS.verifyElementPropertyValue(response, '[45].postId', 10)
WS.verifyElementPropertyValue(response, '[45].id', 46)
WS.verifyElementPropertyValue(response, '[45].name', 'dignissimos et deleniti voluptate et quod')
WS.verifyElementPropertyValue(response, '[45].email', 'Jeremy.Harann@waino.me')
WS.verifyElementPropertyValue(response, '[45].body', 'exercitationem et id quae cum omnis\nvoluptatibus accusantium et quidem\nut ipsam sint\ndoloremque illo ex atque necessitatibus sed')
</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
