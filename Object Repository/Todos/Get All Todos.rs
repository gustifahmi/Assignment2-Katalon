<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Get All Todos</name>
   <tag></tag>
   <elementGuidId>77d9b935-657a-4a03-9558-d586435c0433</elementGuidId>
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
   <restUrl>http://jsonplaceholder.typicode.com/todos</restUrl>
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
WS.verifyElementPropertyValue(response, '[180].completed', false)</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
