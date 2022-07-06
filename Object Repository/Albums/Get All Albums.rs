<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Get All Albums</name>
   <tag></tag>
   <elementGuidId>9d5f503b-faf2-4580-8cf8-e56037df542b</elementGuidId>
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
   <restUrl>http://jsonplaceholder.typicode.com/albums</restUrl>
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

RequestObject request 
ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()

WS.verifyResponseStatusCode(response, 200)
assertThat(response.getStatusCode()).isEqualTo(200)

def results = new groovy.json.JsonSlurper().parseText( response.getResponseBodyContent() )
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
WS.verifyElementPropertyValue(response, '[90].title', 'repellendus praesentium debitis officiis')</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
