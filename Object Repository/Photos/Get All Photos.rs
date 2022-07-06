<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Get All Photos</name>
   <tag></tag>
   <elementGuidId>d212001e-4ae6-45f6-aea7-7acc3693c5f1</elementGuidId>
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
   <restUrl>http://jsonplaceholder.typicode.com/photos</restUrl>
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
WS.verifyElementPropertyValue(response, '[450].thumbnailUrl', 'https://via.placeholder.com/150/5e912a')</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
