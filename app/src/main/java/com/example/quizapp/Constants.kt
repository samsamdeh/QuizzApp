package com.example.quizapp

object Constants {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_question"
    const val CORRECT_ANSWERS:String = "correct_answers"

    fun getQuastions(): ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1,
            "What country does this flag belong to?",
            R.drawable.argentina,
            "Germany",
            "Brazil",
            "Austria",
            "Argentina",
            4
        )

        questionsList.add(que1)

        val que2 = Question(
            2,
            "What country does this flag belong to?",
            R.drawable.australia,
            "Germany",
            "Australia",
            "Austria",
            "Argentina",
            2
        )
        questionsList.add(que2)

        val que3 = Question(
            3,
            "What country does this flag belong to?",
            R.drawable.belgium,
            "Germany",
            "Australia",
            "Belgium",
            "Argentina",
            3
        )
        questionsList.add(que3)

        val que4 = Question(
            4,
            "What country does this flag belong to?",
            R.drawable.brazil,
            "Brazil",
            "Australia",
            "Austria",
            "Argentina",
            1
        )
        questionsList.add(que4)

        val que5 = Question(
            5,
            "What country does this flag belong to?",
            R.drawable.denmark,
            "Germany",
            "Australia",
            "Austria",
            "Denmark",
            2
        )
        questionsList.add(que5)

        val que6 = Question(
            6,
            "What country does this flag belong to?",
            R.drawable.fiji,
            "Germany",
            "Fiji",
            "Austria",
            "Argentina",
            2
        )
        questionsList.add(que6)

        val que7 = Question(
            7,
            "What country does this flag belong to?",
            R.drawable.germany,
            "Germany",
            "Australia",
            "Austria",
            "Argentina",
            1
        )
        questionsList.add(que7)

        val que8 = Question(
            8,
            "What country does this flag belong to?",
            R.drawable.india,
            "Germany",
            "Australia",
            "India",
            "Argentina",
            3
        )
        questionsList.add(que8)

        val que9 = Question(
            9,
            "What country does this flag belong to?",
            R.drawable.kuwait,
            "Germany",
            "Kuwait",
            "Austria",
            "Argentina",
            2
        )
        questionsList.add(que9)

        val que10 = Question(
            10,
            "What country does this flag belong to?",
            R.drawable.zealand,
            "New Zealand",
            "Australia",
            "Austria",
            "Argentina",
            1
        )
        questionsList.add(que10)


        return questionsList
        }

    }