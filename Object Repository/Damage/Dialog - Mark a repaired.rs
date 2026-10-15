<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>Dialog - Mark a repaired</name>
   <tag></tag>
   <elementGuidId>abac811d-949a-4cd2-8ff8-3f1e64a0d471</elementGuidId>
   <selectorCollection>
      <entry>
         <key>XPATH</key>
         <value>//div[@action='async () => {
      try {
        b(!0);
        const e = i.value.map(
          (a) => a == null ? void 0 : a._id
        );
        await S.putMarkAsRepaired({
          ids: e
        }) &amp;&amp; (v.add({
          severity: &quot;success&quot;,
          message: &quot;Success, asset has been marked as repaired.&quot;
        }), i.value = []), G.emit(&quot;data-table:update&quot;, { tableName: n });
      } catch (e) {
        return v.add({
          error: e,
          message: &quot;Error, failed to mark asset as repaired. Please check your connection and try again.&quot;
        });
      } finally {
        b(!1);
      }
    }']</value>
      </entry>
      <entry>
         <key>CSS</key>
      </entry>
   </selectorCollection>
   <selectorMethod>BASIC</selectorMethod>
   <smartLocatorCollection>
      <entry>
         <key>SMART_LOCATOR</key>
         <value>internal:text=&quot;Mark as RepairedThis action will mark asset as repaired and move asset to Availa&quot;i</value>
      </entry>
   </smartLocatorCollection>
   <smartLocatorEnabled>false</smartLocatorEnabled>
   <useRalativeImagePath>true</useRalativeImagePath>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>div</value>
      <webElementGuid>f9be45ab-6d84-422f-b11b-61f4ed39fde6</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>role</name>
      <type>Main</type>
      <value>dialog</value>
      <webElementGuid>7d253d08-55a0-4f88-833f-d60a357301fe</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>aria-labelledby</name>
      <type>Main</type>
      <value>pv_id_40_header</value>
      <webElementGuid>a9a0b947-d7a5-47d3-807a-4d6bef91861e</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>aria-modal</name>
      <type>Main</type>
      <value>true</value>
      <webElementGuid>22805c7d-8170-4a8e-b448-e0f26dc4cba8</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>lists</name>
      <type>Main</type>
      <value>[object Object]</value>
      <webElementGuid>56f65e0a-c9de-43df-ad90-e895cdb24ce1</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>body</name>
      <type>Main</type>
      <value>This action will mark asset as repaired and move asset to Available.</value>
      <webElementGuid>96556a01-47ab-47f4-93e7-fc5f58abd640</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>extraline</name>
      <type>Main</type>
      <value>Are you sure you want to continue?</value>
      <webElementGuid>c71c43ee-0d69-4012-bfc5-31530ed8e60f</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>action</name>
      <type>Main</type>
      <value>async () => {
      try {
        b(!0);
        const e = i.value.map(
          (a) => a == null ? void 0 : a._id
        );
        await S.putMarkAsRepaired({
          ids: e
        }) &amp;&amp; (v.add({
          severity: &quot;success&quot;,
          message: &quot;Success, asset has been marked as repaired.&quot;
        }), i.value = []), G.emit(&quot;data-table:update&quot;, { tableName: n });
      } catch (e) {
        return v.add({
          error: e,
          message: &quot;Error, failed to mark asset as repaired. Please check your connection and try again.&quot;
        });
      } finally {
        b(!1);
      }
    }</value>
      <webElementGuid>10c188f6-4036-4ddf-9262-ae0508a35532</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>class</name>
      <type>Main</type>
      <value>rounded-[0.4375em] shadow-panel flex flex-col p-6 gap-3 bg-white max-h-[90vh] sm:max-w-[90vw] m-0 transform scale-100 !w-[clamp(360px,75vw,400px)]</value>
      <webElementGuid>a6b40540-a485-4a86-98a5-16354fca38dd</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>data-wv-section</name>
      <type>Main</type>
      <value>dialogconfirm</value>
      <webElementGuid>2e72359a-fac4-4a63-a067-ac9bdec1942a</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>data-wv-name</name>
      <type>Main</type>
      <value>root</value>
      <webElementGuid>da47831e-7c28-4299-aa79-4aa62cfc4a80</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>data-pc-name</name>
      <type>Main</type>
      <value>dialog</value>
      <webElementGuid>b99d3318-e17f-4509-b9f2-7d29773bdd34</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>data-pc-section</name>
      <type>Main</type>
      <value>root</value>
      <webElementGuid>a7044f26-2ab5-4fec-8daa-1199e1d4c20e</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>data-pd-focustrap</name>
      <type>Main</type>
      <value>true</value>
      <webElementGuid>3820d7b9-367d-4d49-a89b-bef0956987ae</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>Mark as RepairedThis action will mark asset as repaired and move asset to Available.Are you sure you want to continue?CancelContinue</value>
      <webElementGuid>2ae9de3e-f7d5-4e7c-8c62-55b665b81b46</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>/html[1]/body[@class=&quot;p-overflow-hidden&quot;]/div[@class=&quot;transition duration-300 has-[.mask-active]:bg-transparent bg-dialog-mask has-[.mask-active]:backdrop-blur-none backdrop-blur-sm&quot;]/div[@class=&quot;rounded-[0.4375em] shadow-panel flex flex-col p-6 gap-3 bg-white max-h-[90vh] sm:max-w-[90vw] m-0 transform scale-100 !w-[clamp(360px,75vw,400px)]&quot;]</value>
      <webElementGuid>96f51e9d-5e74-49a3-95d4-5411f8e01992</webElementGuid>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:attributes</name>
      <type>Main</type>
      <value>//div[@action='async () => {
      try {
        b(!0);
        const e = i.value.map(
          (a) => a == null ? void 0 : a._id
        );
        await S.putMarkAsRepaired({
          ids: e
        }) &amp;&amp; (v.add({
          severity: &quot;success&quot;,
          message: &quot;Success, asset has been marked as repaired.&quot;
        }), i.value = []), G.emit(&quot;data-table:update&quot;, { tableName: n });
      } catch (e) {
        return v.add({
          error: e,
          message: &quot;Error, failed to mark asset as repaired. Please check your connection and try again.&quot;
        });
      } finally {
        b(!1);
      }
    }']</value>
      <webElementGuid>99325a27-d371-4c2c-a66e-b19a7c4c4262</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='`'])[1]/following::div[8]</value>
      <webElementGuid>3798965a-c9cc-4fc5-a58f-20409f505f6f</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <type>Main</type>
      <value>//div[4]/div</value>
      <webElementGuid>c2548caf-541b-4e14-8742-ee4a6c10bc32</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:customAttributes</name>
      <type>Main</type>
      <value>//div[(text() = 'Mark as RepairedThis action will mark asset as repaired and move asset to Available.Are you sure you want to continue?CancelContinue' or . = 'Mark as RepairedThis action will mark asset as repaired and move asset to Available.Are you sure you want to continue?CancelContinue')]</value>
      <webElementGuid>828d467c-ec38-460a-8298-3c3b8b55ed1c</webElementGuid>
   </webElementXpaths>
</WebElementEntity>
