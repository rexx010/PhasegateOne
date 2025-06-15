import MentrualAppFunction
from unittest import TestCase
import datetime

class TestMenstrualApp(TestCase):
	def test_start_cycle_unction_exist(self):
		MentrualAppFunction.begin(1, 2, 3);


	def test_that_start_Cycle_Function_Returns_Correct_Output(self):
		actual = MentrualAppFunction.begin(2025, 11, 15);
		expected = ('Your cycle starts on ', datetime.date(2025, 11, 15))
		self.assertEqual(actual, expected)


	def test_that_start_Cycle_Function_dont_accept_negative_value(self):
		actual = MentrualAppFunction.begin(2025, -11, -15);
		expected = "Invalid input";
		self.assertEqual(actual, expected)


	def test_that_year_value_is_not_more_than_5(self):
		actual = MentrualAppFunction.begin(20255, 11, 15);
		expected = "Year can't have more than 5 digits for years";
		self.assertEqual(actual, expected)


	def test_that_month_value_is_not_more_than_12_or_less_than_1(self):
		actual = MentrualAppFunction.begin(2025, 15, 15);
		expected = "Months can't have more than 12";
		self.assertEqual(actual, expected)


	def test_that_days_value_is_not_more_than_10_or_31(self):
		actual = MentrualAppFunction.begin(2025, 5, 35);
		expected = "Days can't have more than 30 or 31";
		self.assertEqual(actual, expected)


	def test_that_end_Cycle_Function_Exist(self):
		MentrualAppFunction.finish(2025, 5, 30, 28);


	def test_that_end_Cycle_is_Accurate(self):
		actual = MentrualAppFunction.finish(2025, 11, 15, 28);
		expected = ('Your cycle ends on the ', datetime.date(2025, 12, 13))
		self.assertEqual(actual, expected)


	def test_that_flow_Cycle_Function_Exist(self):
		MentrualAppFunction.flowDate(2025, 5, 30);


	def test_that_flow_Cycle_is_Accurate(self):
		actual = MentrualAppFunction.flowDate(2025, 11, 15);
		expected = ('your flow starts on ', datetime.date(2025, 11, 15), ' it ends on ', datetime.date(2025, 11, 20))
		self.assertEqual(actual, expected)


	def test_that_ovulation_period_Function_Exist(self):
		MentrualAppFunction.ovulation(2025, 11, 15, 28);


	def test_that_ovulation_period_is_Accurate(self):
		actual = MentrualAppFunction.ovulation(2025, 11, 15, 28);
		expected = ('your ovulation starts on ', datetime.date(2025, 11, 27), ' it ends on ', datetime.date(2025, 12, 1))
		self.assertEqual(actual, expected)


	def test_that_fertile_length_period_Function_Exist(self):
		MentrualAppFunction.fertileLength(2025, 11, 15, 28);


	def test_that_fertile_length_period_is_accurate(self):
		actual = MentrualAppFunction.fertileLength(2025, 11, 15, 28);
		expected = ('your fertility starts on the ', datetime.date(2025, 11, 22), ' it ends on the ', datetime.date(2025, 12, 1))
		self.assertEqual(actual, expected)


	def test_that_safe_period_Function_Exist(self):
		MentrualAppFunction.safeperiod(2025, 11, 15, 28);


	def test_that_safe_period_is_accurate(self):
		actual = MentrualAppFunction.safeperiod(2025, 11, 15, 28);
		expected = ('All days are safe to have fun excluding days within ', datetime.date(2025, 11, 22), ' and ', datetime.date(2025, 12, 1))
		self.assertEqual(actual, expected)