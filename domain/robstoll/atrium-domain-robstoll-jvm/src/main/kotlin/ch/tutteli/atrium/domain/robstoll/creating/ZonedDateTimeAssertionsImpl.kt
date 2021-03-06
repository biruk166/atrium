@file:Suppress("JAVA_MODULE_DOES_NOT_READ_UNNAMED_MODULE" /* TODO remove once https://youtrack.jetbrains.com/issue/KT-35343 is fixed */)

package ch.tutteli.atrium.domain.robstoll.creating

import ch.tutteli.atrium.creating.Expect
import ch.tutteli.atrium.domain.creating.ZonedDateTimeAssertions
import ch.tutteli.atrium.domain.robstoll.lib.creating._day
import ch.tutteli.atrium.domain.robstoll.lib.creating._dayOfWeek
import ch.tutteli.atrium.domain.robstoll.lib.creating._month
import ch.tutteli.atrium.domain.robstoll.lib.creating._year
import java.time.ZonedDateTime

class ZonedDateTimeAssertionsImpl : ZonedDateTimeAssertions {
    override fun <T : ZonedDateTime> year(expect: Expect<T>) = _year(expect)

    override fun <T : ZonedDateTime> month(expect: Expect<T>) = _month(expect)

    override fun <T : ZonedDateTime> day(expect: Expect<T>) = _day(expect)

    override fun <T : ZonedDateTime> dayOfWeek(expect: Expect<T>) = _dayOfWeek(expect)
}
