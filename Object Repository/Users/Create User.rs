<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Create User</name>
   <tag></tag>
   <elementGuidId>66d3b596-3b91-4ad6-8c81-02b5074b13f1</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>0</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n  \&quot;name\&quot;: \&quot;John Doe\&quot;,\n  \&quot;username\&quot;: \&quot;Jojon\&quot;,\n  \&quot;email\&quot;: \&quot;jojon@example.com\&quot;,\n  \&quot;address\&quot;: {\n    \&quot;street\&quot;: \&quot;Grove Street\&quot;,\n    \&quot;suite\&quot;: \&quot;Apt. 666\&quot;,\n    \&quot;city\&quot;: \&quot;Bekasi\&quot;,\n    \&quot;zipcode\&quot;: \&quot;14045\&quot;,\n    \&quot;geo\&quot;: {\n      \&quot;lat\&quot;: \&quot;-99.9999\&quot;,\n      \&quot;lng\&quot;: \&quot;88.8888\&quot;\n    }\n  },\n  \&quot;phone\&quot;: \&quot;021-1111111\&quot;,\n  \&quot;website\&quot;: \&quot;example.com\&quot;,\n  \&quot;company\&quot;: {\n    \&quot;name\&quot;: \&quot;Makmur Jaya\&quot;,\n    \&quot;catchPhrase\&quot;: \&quot;Test create user\&quot;,\n    \&quot;bs\&quot;: \&quot;Test create user\&quot;\n  }\n}\n&quot;,
  &quot;contentType&quot;: &quot;application/json&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
      <webElementGuid>a5ff408a-64d6-4a2f-a891-9617ab38d594</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>8.3.5</katalonVersion>
   <maxResponseSize>0</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>http://jsonplaceholder.typicode.com/users</restUrl>
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
WS.verifyElementPropertyValue(response, 'id', 11)</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
