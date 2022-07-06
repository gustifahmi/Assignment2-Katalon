<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Get Photo By Id</name>
   <tag></tag>
   <elementGuidId>07e1dc36-be86-4418-8456-d27e103ed72e</elementGuidId>
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
   <restUrl>https://jsonplaceholder.typicode.com/photos/1</restUrl>
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

WS.verifyElementPropertyValue(response, 'albumId', 1)
WS.verifyElementPropertyValue(response, 'id', 1)
WS.verifyElementPropertyValue(response, 'title', 'accusamus beatae ad facilis cum similique qui sunt')
WS.verifyElementPropertyValue(response, 'url', 'https://via.placeholder.com/600/92c952')
WS.verifyElementPropertyValue(response, 'thumbnailUrl', 'https://via.placeholder.com/150/92c952')</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
