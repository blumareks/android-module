package com.ibm.ibmguardrailsdk

import org.json.JSONObject

object Models {

    var topic: String = "you are a travel agent responding to requests for trip planning or suggestions."

    fun setOnTopic(topic: String) {
        this.topic = topic
        println("Singleton changed onTopic to: " + topic)
    }
    fun getOnTopic(prompt: String) : JSONObject {
        println("Singleton is doing something!"  + prompt)
        val jsonObject = JSONObject()
        jsonObject.put("onTopic","true")
        jsonObject.put("odds", 0.5)
        jsonObject.put("certainty",0.9 )

        return jsonObject
    }
    fun getOnPromptArmor(prompt: String) : JSONObject {
        println("Singleton is doing something!"  + prompt)

        val jsonObject = JSONObject()

        jsonObject.put("safe","true")
        jsonObject.put("odds", 0.5)
        jsonObject.put("certainty",0.9 )

        return jsonObject
    }

    fun getHAP(prompt: String) : JSONObject {
        println("Singleton is doing something!"  + prompt)

        val jsonObject = JSONObject()

        jsonObject.put("safe","true")
        jsonObject.put("odds", 0.5)
        jsonObject.put("certainty",0.9 )

        return jsonObject
    }

    fun getPII(prompt: String) : JSONObject {
        println("Singleton is doing something!"  + prompt)

        val jsonObject = JSONObject()

        jsonObject.put("safe","true")
        jsonObject.put("odds", 0.5)
        jsonObject.put("certainty",0.9 )

        return jsonObject
    }
}
