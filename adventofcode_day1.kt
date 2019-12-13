fun main() {
    var masses = arrayOf(
        82406,
        83106,
        120258,
        142695,
        50629,
        117793,
        81165,
        83442,
        70666,
        94355,
        64069,
        72830,
        88813,
        148762,
        90723,
        121206,
        57713,
        116892,
        82470,
        101686,
        83768,
        92160,
        91532,
        136997,
        142382,
        120050,
        81062,
        106227,
        112071,
        102275,
        54033,
        109059,
        91772,
        63320,
        81872,
        52925,
        92225,
        60053,
        110402,
        97125,
        87404,
        54970,
        66662,
        83979,
        88474,
        91361,
        69272,
        61559,
        56603,
        96324,
        66226,
        95278,
        105643,
        139141,
        116838,
        130717,
        97708,
        108371,
        73652,
        100518,
        98295,
        63127,
        50486,
        121157,
        109721,
        110874,
        124791,
        147116,
        127335,
        65889,
        76769,
        100596,
        79740,
        125860,
        120185,
        73861,
        97700,
        147169,
        106781,
        71891,
        64744,
        107113,
        59274,
        77680,
        101891,
        69848,
        98922,
        147825,
        128315,
        55221,
        119892,
        87492,
        75814,
        80350,
        131504,
        81095,
        57344,
        63765,
        143915,
        126768
    )

    var testValue: Int = 100756
    val mass: MutableList<Int> = mutableListOf<Int>()
    var const: Int
    var totalMass: Int

    val calculatedFuels = masses.map {
//        mass.add(it)
        const = massCalculate(it)
        mass.add(const)
        while (const >8) {
            const = massCalculate(const)
            mass.add(const)
        }
        const
    }

    println("the mass is ${mass.sum()} and ${mass}")
}

fun massCalculate(arg: Int): Int = arg / 3 - 2


//const = testValue
////    mass.add(const)
//      while (const >8) {
//        const = massCalculate(const)
//        mass.add(const)}

//    totalMass = mass.sum() + masses.sum()