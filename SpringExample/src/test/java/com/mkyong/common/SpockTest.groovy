package com.mkyong.common;
import com.mkyong.common.SpockTest



class SpockTest extends Specification{
	def "length of Spock's and his friends' names"() {
		expect:
		name.size() == length

		where:
		name     | length
		"Spock"  | 5
		"Kirk"   | 4
		"Scotty" | 6
	}
}
