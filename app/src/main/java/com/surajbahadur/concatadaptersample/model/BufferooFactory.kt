package com.surajbahadur.concatadaptersample.model

fun getMobileBufferoos(): List<Bufferoo> {
    return listOf<Bufferoo>(
        Bufferoo(
            "User 1",
            "Android Engineer",
            image = "https://avatars2.githubusercontent.com/u/3879281?s=460&u=1681233e5efea9cb7811a073f9d015b6493f13ca&v=4"
        ),
        Bufferoo(
            "User 2",
            "iOS Engineer",
            image = "https://avatars1.githubusercontent.com/u/5566805?s=400&u=02f9d1900ccaa1bd7129094a359c399314cd54c9&v=4"
        ),
        Bufferoo(
            "User 3",
            "Designer",
            image = "https://avatars1.githubusercontent.com/u/13378873?s=460&u=094d69ba59bd58b1159a00dc5516053710efe3fb&v=4"
        ),
        Bufferoo(
            "User 4",
            "iOS Engineer",
            image = "https://avatars1.githubusercontent.com/u/1058408?s=460&v=4"
        )
    )
}