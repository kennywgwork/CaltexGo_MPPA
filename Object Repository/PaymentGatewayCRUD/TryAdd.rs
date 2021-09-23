<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>TryAdd</name>
   <tag></tag>
   <elementGuidId>a0f1a3e8-82dd-427a-b5e7-1f33efe3096f</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>0</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n  \&quot;paymentGatewayProviderId\&quot;: 1,\n  \&quot;name\&quot;: \&quot;${PGName}\&quot;,\n  \&quot;profileId\&quot;: \&quot;string\&quot;,\n  \&quot;accessKey\&quot;: \&quot;string\&quot;,\n  \&quot;secretKey\&quot;: \&quot;string\&quot;,\n  \&quot;onboardUrl\&quot;: \&quot;string\&quot;,\n  \&quot;onboardFinishUrl\&quot;: \&quot;string\&quot;,\n  \&quot;onboardCancelledUrl\&quot;: \&quot;string\&quot;,\n  \&quot;onboardErrorUrl\&quot;: \&quot;string\&quot;,\n  \&quot;apiEndpoint\&quot;: \&quot;string\&quot;,\n  \&quot;onboardTimeout\&quot;: 1,\n  \&quot;maximumCardAllowed\&quot;: 1,\n  \&quot;masterMerchantId\&quot;: \&quot;string\&quot;,\n  \&quot;masterMerchantKeyFileName\&quot;: \&quot;string\&quot;,\n  \&quot;defaultCountry\&quot;: 0,\n  \&quot;defaultCurrency\&quot;: 0,\n  \&quot;isAvailable\&quot;: true,\n  \&quot;logo\&quot;: \&quot;string\&quot;,\n  \&quot;clientId\&quot;: \&quot;string\&quot;,\n  \&quot;onboardingMethod\&quot;: \&quot;string\&quot;,\n  \&quot;excludeLoyalty\&quot;: true,\n  \&quot;preauthAmount\&quot;: 0,\n  \&quot;configurationKey\&quot;: \&quot;string\&quot;,\n  \&quot;acquirerId\&quot;: \&quot;string\&quot;,\n  \&quot;cardPrefix\&quot;: \&quot;string\&quot;,\n  \&quot;cardLogos\&quot;: [\n    {\n      \&quot;id\&quot;: 0,\n      \&quot;cardName\&quot;: \&quot;string\&quot;,\n      \&quot;cardType\&quot;: \&quot;string\&quot;,\n      \&quot;logo\&quot;: \&quot;string\&quot;,\n      \&quot;acceptanceLogo\&quot;: \&quot;string\&quot;\n    }\n  ]\n}&quot;,
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
   </httpHeaderProperties>
   <katalonVersion>8.1.0</katalonVersion>
   <maxResponseSize>0</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>http://localhost:1203/api/v1/payment/payment-gateway</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>0</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <variables>
      <defaultValue>'string'</defaultValue>
      <description></description>
      <id>f7ba1abb-5a68-4910-a0b0-ff9a8d194b42</id>
      <masked>false</masked>
      <name>PGName</name>
   </variables>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
