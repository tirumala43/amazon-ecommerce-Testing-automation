<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>td_39.9539.95 - 42.9542.95                 _b3497f</name>
   <tag></tag>
   <elementGuidId>2b0dd1f0-006d-4e52-8dc8-6e2ce6e5b5dc</elementGuidId>
   <selectorCollection>
      <entry>
         <key>CSS</key>
         <value>td.a-span12</value>
      </entry>
      <entry>
         <key>XPATH</key>
         <value>//div[@id='corePrice_desktop']/div/table/tbody/tr/td[2]</value>
      </entry>
   </selectorCollection>
   <selectorMethod>XPATH</selectorMethod>
   <useRalativeImagePath>true</useRalativeImagePath>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>td</value>
      <webElementGuid>af953b5a-aab3-4363-bc6d-3c9384046954</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>class</name>
      <type>Main</type>
      <value>a-span12</value>
      <webElementGuid>615e47dd-3f2a-4995-80a4-e809be0eb832</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>             $39.95$39.95 - $42.95$42.95                                
                          
                                           
              
                               
              
                                   
              
                     
  P.when(&quot;A&quot;, &quot;jQuery&quot;).execute(function(A, $) {
    $(&quot;#selectQuantity [name='quantity'], #mobileQuantityDropDown&quot;).live(&quot;change&quot;, function (event) {
      if (event.updatePromiseBadgeOnQuantityChange) {
          return;
      }

      event.updatePromiseBadgeOnQuantityChange = 1;

      // &quot;#buybox&quot; is included in this list because if there is no accordion row, then it is a single-offer layout
      // possible id's may include &quot;usedAccordionRow&quot;, &quot;newAccordionRow_1&quot;, &quot;newAccordionRow_2&quot;
      var accordionRow = $(this).closest('[id$=&quot;AccordionRow&quot;], #buybox, [id^=&quot;newAccordionRow&quot;]');

      var quantity = $(this).val();
      // This asin and merchantId will support use case in US marketplace.
      // DDM will be required here to support the feature in IN marketplace
      var asin = accordionRow.find(&quot;#deliveryBlockSelectAsin&quot;).val();
      var merchantId = accordionRow.find(&quot;#deliveryBlockSelectMerchant&quot;).val();

      if (!asin) {
        asin = accordionRow.find(&quot;#ftSelectAsin&quot;).val();
      }
      if (!merchantId) {
        merchantId = accordionRow.find(&quot;#ftSelectMerchant&quot;).val();
      }

      if (!asin || !quantity) {
        return;
      }

      var params = [];
      params.push(&quot;asin=&quot; + asin);
      params.push(&quot;quantity=&quot; + quantity);
      params.push(&quot;exclusiveMerchantId=&quot; + merchantId);
      params.push(&quot;merchantId=&quot; + merchantId);
      params.push(&quot;clientId=retailwebsite&quot;);
      params.push(&quot;deviceType=web&quot;);
      params.push(&quot;showFeatures=priceBlockMs3Mir&quot;);
      params.push(&quot;ie=UTF8&quot;);
      params.push(&quot;experienceId=priceBadgingQuantityRefreshAjaxExperience&quot;);

      // Weblab gated addition of Locale to QuantityRefresh request
      var addLocaleToQuantityRefreshWeblabFlag = false;
      if (addLocaleToQuantityRefreshWeblabFlag) {
        var locale = accordionRow.find(&quot;#deliveryBlockSelectLocale&quot;).val();

        // Only add language param if locale is non-null
        if (locale) {
            params.push(&quot;language=&quot; + locale);
        }
      }

      $.ajax({
        type: &quot;GET&quot;,
        url: &quot;/gp/product/ajax?&quot;,
        contentType: 'application/x-www-form-urlencoded;charset=utf-8',
        data: params.join('&amp;'),
        accordionRow: accordionRow,
        dataType: &quot;html&quot;,
        success: function (objResponse) {
          if (objResponse != null &amp;&amp; objResponse != &quot;&quot;) {
            accordionRow.find(&quot;#priceBadging_feature_div&quot;).replaceWith(objResponse);

            // If it's a single buying option layout or the new buy box quantity changed, update data outside the buy box
            if ($(&quot;#buyBoxAccordion, #buybox&quot;).children().length === 1 || accordionRow.attr(&quot;id&quot;).match(/^newAccordionRow/)) {
              $(&quot;#price #priceblock_ourprice_row #ourprice_shippingmessage #priceBadging_feature_div&quot;).replaceWith(objResponse);
              $(&quot;#newOfferShippingMessage_feature_div #ourPrice_availability #priceBadging_feature_div&quot;).replaceWith(objResponse);
              $(&quot;#price #priceblock_saleprice_row #saleprice_shippingmessage #priceBadging_feature_div&quot;).replaceWith(objResponse);
              $(&quot;#price #priceblock_dealprice_row #dealprice_shippingmessage #priceBadging_feature_div&quot;).replaceWith(objResponse);
            }
          }
        }
      });

      return;
    });
  });
                      
              
               
                           
              
                                 
              
                                
       
           </value>
      <webElementGuid>184db924-93dc-45a9-97ab-04db0b818f3d</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>id(&quot;corePrice_desktop&quot;)/div[@class=&quot;a-section a-spacing-small&quot;]/table[@class=&quot;a-lineitem a-align-top&quot;]/tbody[1]/tr[1]/td[@class=&quot;a-span12&quot;]</value>
      <webElementGuid>39092ede-4e15-4db2-ac0c-192009d8f72f</webElementGuid>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:idRelative</name>
      <type>Main</type>
      <value>//div[@id='corePrice_desktop']/div/table/tbody/tr/td[2]</value>
      <webElementGuid>f31e491d-7205-41c0-a3e5-a9937b0911c2</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <type>Main</type>
      <value>//td[2]</value>
      <webElementGuid>41f4e883-e863-4b14-8152-761f3dba1c28</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:customAttributes</name>
      <type>Main</type>
      <value>//td[(text() = concat(&quot;             $39.95$39.95 - $42.95$42.95                                
                          
                                           
              
                               
              
                                   
              
                     
  P.when(&quot;A&quot;, &quot;jQuery&quot;).execute(function(A, $) {
    $(&quot;#selectQuantity [name=&quot; , &quot;'&quot; , &quot;quantity&quot; , &quot;'&quot; , &quot;], #mobileQuantityDropDown&quot;).live(&quot;change&quot;, function (event) {
      if (event.updatePromiseBadgeOnQuantityChange) {
          return;
      }

      event.updatePromiseBadgeOnQuantityChange = 1;

      // &quot;#buybox&quot; is included in this list because if there is no accordion row, then it is a single-offer layout
      // possible id&quot; , &quot;'&quot; , &quot;s may include &quot;usedAccordionRow&quot;, &quot;newAccordionRow_1&quot;, &quot;newAccordionRow_2&quot;
      var accordionRow = $(this).closest(&quot; , &quot;'&quot; , &quot;[id$=&quot;AccordionRow&quot;], #buybox, [id^=&quot;newAccordionRow&quot;]&quot; , &quot;'&quot; , &quot;);

      var quantity = $(this).val();
      // This asin and merchantId will support use case in US marketplace.
      // DDM will be required here to support the feature in IN marketplace
      var asin = accordionRow.find(&quot;#deliveryBlockSelectAsin&quot;).val();
      var merchantId = accordionRow.find(&quot;#deliveryBlockSelectMerchant&quot;).val();

      if (!asin) {
        asin = accordionRow.find(&quot;#ftSelectAsin&quot;).val();
      }
      if (!merchantId) {
        merchantId = accordionRow.find(&quot;#ftSelectMerchant&quot;).val();
      }

      if (!asin || !quantity) {
        return;
      }

      var params = [];
      params.push(&quot;asin=&quot; + asin);
      params.push(&quot;quantity=&quot; + quantity);
      params.push(&quot;exclusiveMerchantId=&quot; + merchantId);
      params.push(&quot;merchantId=&quot; + merchantId);
      params.push(&quot;clientId=retailwebsite&quot;);
      params.push(&quot;deviceType=web&quot;);
      params.push(&quot;showFeatures=priceBlockMs3Mir&quot;);
      params.push(&quot;ie=UTF8&quot;);
      params.push(&quot;experienceId=priceBadgingQuantityRefreshAjaxExperience&quot;);

      // Weblab gated addition of Locale to QuantityRefresh request
      var addLocaleToQuantityRefreshWeblabFlag = false;
      if (addLocaleToQuantityRefreshWeblabFlag) {
        var locale = accordionRow.find(&quot;#deliveryBlockSelectLocale&quot;).val();

        // Only add language param if locale is non-null
        if (locale) {
            params.push(&quot;language=&quot; + locale);
        }
      }

      $.ajax({
        type: &quot;GET&quot;,
        url: &quot;/gp/product/ajax?&quot;,
        contentType: &quot; , &quot;'&quot; , &quot;application/x-www-form-urlencoded;charset=utf-8&quot; , &quot;'&quot; , &quot;,
        data: params.join(&quot; , &quot;'&quot; , &quot;&amp;&quot; , &quot;'&quot; , &quot;),
        accordionRow: accordionRow,
        dataType: &quot;html&quot;,
        success: function (objResponse) {
          if (objResponse != null &amp;&amp; objResponse != &quot;&quot;) {
            accordionRow.find(&quot;#priceBadging_feature_div&quot;).replaceWith(objResponse);

            // If it&quot; , &quot;'&quot; , &quot;s a single buying option layout or the new buy box quantity changed, update data outside the buy box
            if ($(&quot;#buyBoxAccordion, #buybox&quot;).children().length === 1 || accordionRow.attr(&quot;id&quot;).match(/^newAccordionRow/)) {
              $(&quot;#price #priceblock_ourprice_row #ourprice_shippingmessage #priceBadging_feature_div&quot;).replaceWith(objResponse);
              $(&quot;#newOfferShippingMessage_feature_div #ourPrice_availability #priceBadging_feature_div&quot;).replaceWith(objResponse);
              $(&quot;#price #priceblock_saleprice_row #saleprice_shippingmessage #priceBadging_feature_div&quot;).replaceWith(objResponse);
              $(&quot;#price #priceblock_dealprice_row #dealprice_shippingmessage #priceBadging_feature_div&quot;).replaceWith(objResponse);
            }
          }
        }
      });

      return;
    });
  });
                      
              
               
                           
              
                                 
              
                                
       
           &quot;) or . = concat(&quot;             $39.95$39.95 - $42.95$42.95                                
                          
                                           
              
                               
              
                                   
              
                     
  P.when(&quot;A&quot;, &quot;jQuery&quot;).execute(function(A, $) {
    $(&quot;#selectQuantity [name=&quot; , &quot;'&quot; , &quot;quantity&quot; , &quot;'&quot; , &quot;], #mobileQuantityDropDown&quot;).live(&quot;change&quot;, function (event) {
      if (event.updatePromiseBadgeOnQuantityChange) {
          return;
      }

      event.updatePromiseBadgeOnQuantityChange = 1;

      // &quot;#buybox&quot; is included in this list because if there is no accordion row, then it is a single-offer layout
      // possible id&quot; , &quot;'&quot; , &quot;s may include &quot;usedAccordionRow&quot;, &quot;newAccordionRow_1&quot;, &quot;newAccordionRow_2&quot;
      var accordionRow = $(this).closest(&quot; , &quot;'&quot; , &quot;[id$=&quot;AccordionRow&quot;], #buybox, [id^=&quot;newAccordionRow&quot;]&quot; , &quot;'&quot; , &quot;);

      var quantity = $(this).val();
      // This asin and merchantId will support use case in US marketplace.
      // DDM will be required here to support the feature in IN marketplace
      var asin = accordionRow.find(&quot;#deliveryBlockSelectAsin&quot;).val();
      var merchantId = accordionRow.find(&quot;#deliveryBlockSelectMerchant&quot;).val();

      if (!asin) {
        asin = accordionRow.find(&quot;#ftSelectAsin&quot;).val();
      }
      if (!merchantId) {
        merchantId = accordionRow.find(&quot;#ftSelectMerchant&quot;).val();
      }

      if (!asin || !quantity) {
        return;
      }

      var params = [];
      params.push(&quot;asin=&quot; + asin);
      params.push(&quot;quantity=&quot; + quantity);
      params.push(&quot;exclusiveMerchantId=&quot; + merchantId);
      params.push(&quot;merchantId=&quot; + merchantId);
      params.push(&quot;clientId=retailwebsite&quot;);
      params.push(&quot;deviceType=web&quot;);
      params.push(&quot;showFeatures=priceBlockMs3Mir&quot;);
      params.push(&quot;ie=UTF8&quot;);
      params.push(&quot;experienceId=priceBadgingQuantityRefreshAjaxExperience&quot;);

      // Weblab gated addition of Locale to QuantityRefresh request
      var addLocaleToQuantityRefreshWeblabFlag = false;
      if (addLocaleToQuantityRefreshWeblabFlag) {
        var locale = accordionRow.find(&quot;#deliveryBlockSelectLocale&quot;).val();

        // Only add language param if locale is non-null
        if (locale) {
            params.push(&quot;language=&quot; + locale);
        }
      }

      $.ajax({
        type: &quot;GET&quot;,
        url: &quot;/gp/product/ajax?&quot;,
        contentType: &quot; , &quot;'&quot; , &quot;application/x-www-form-urlencoded;charset=utf-8&quot; , &quot;'&quot; , &quot;,
        data: params.join(&quot; , &quot;'&quot; , &quot;&amp;&quot; , &quot;'&quot; , &quot;),
        accordionRow: accordionRow,
        dataType: &quot;html&quot;,
        success: function (objResponse) {
          if (objResponse != null &amp;&amp; objResponse != &quot;&quot;) {
            accordionRow.find(&quot;#priceBadging_feature_div&quot;).replaceWith(objResponse);

            // If it&quot; , &quot;'&quot; , &quot;s a single buying option layout or the new buy box quantity changed, update data outside the buy box
            if ($(&quot;#buyBoxAccordion, #buybox&quot;).children().length === 1 || accordionRow.attr(&quot;id&quot;).match(/^newAccordionRow/)) {
              $(&quot;#price #priceblock_ourprice_row #ourprice_shippingmessage #priceBadging_feature_div&quot;).replaceWith(objResponse);
              $(&quot;#newOfferShippingMessage_feature_div #ourPrice_availability #priceBadging_feature_div&quot;).replaceWith(objResponse);
              $(&quot;#price #priceblock_saleprice_row #saleprice_shippingmessage #priceBadging_feature_div&quot;).replaceWith(objResponse);
              $(&quot;#price #priceblock_dealprice_row #dealprice_shippingmessage #priceBadging_feature_div&quot;).replaceWith(objResponse);
            }
          }
        }
      });

      return;
    });
  });
                      
              
               
                           
              
                                 
              
                                
       
           &quot;))]</value>
      <webElementGuid>65e27dfb-7271-4ba4-99b2-eb795b72ccd4</webElementGuid>
   </webElementXpaths>
</WebElementEntity>
