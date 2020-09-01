package com.example.notify

import com.android.volley.Request
import com.android.volley.VolleyError
import com.android.volley.toolbox.JsonArrayRequest
import org.json.JSONArray

class CodeForcesParser {
    private val url = "https://codeforces.com/api/contest.list"
    var list: JSONArray = JSONArray()

    init {
        val contestList = JsonArrayRequest(Request.Method.GET, url, null,
            { response ->
                list = response

            },
            { error -> getError(error) })

    }

    fun getResponse(response: JSONArray) {

    }

    fun getError(error: VolleyError): VolleyError {
        return error
    }


}