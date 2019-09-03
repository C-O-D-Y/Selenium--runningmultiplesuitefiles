package com.atmecs.constants;

import java.io.IOException;
import java.util.Properties;

import com.atmecs.utils.ReadPropertiesFile;

public class OneWayTrip {
	Properties onewayProperty;
	Properties productName;
	private String loc_to_box;
	private String loc_to_inputtext;
	private String loc_to_search;
	private String loc_oneway_rbtn;
	private String loc_from_box;
	private String loc_from_inputtext;
	private String loc_from_search;
	private String loc_search_btn;
	private String loc_departure_btn;
	private String loc_calender_departure_date_btn;
	private String loc_traveller_class_btn;
	private String loc_traveller_adults_btn;
	private String loc_traveller_children_btn;
	private String loc_traveller_infants_btn;
	private String loc_traveller_choose_travel_class_btn;
	private String loc_traveller_apply_btn;
	private String loc_non_stop_cbox;
	private String loc_departure_12noon_to_6pm_cbox;
	private String loc_arrival_6am_to_12noon_cbox;
	private String loc_sortby_departure_btn;
	private String loc_book_now_btn;
	private String loc_flight_details_btn;
	private String loc_continue_btn;
	private String loc_add_adult_btn;
	private String loc_add_children_btn;
	private String loc_add_infant_btn;
	private String loc_firstname_btn;
	private String loc_lastname_btn;
	private String loc_m_gender_rbtn;
	private String loc_f_gender_rbtn;
	private String loc_date_of_birth_date_btn;
	private String loc_date_of_birth_month_btn;
	private String loc_date_of_birth_year_btn;
	private String loc_contact_info_country_code_click_dpdn;
	private String loc_contact_info_country_code_select_dpdn;
	private String loc_contact_info_mob_no_text;
	private String loc_contact_info_email_text;
	private String loc_flight_details_continue_btn;

	public OneWayTrip() {
		try {
			onewayProperty = ReadPropertiesFile.loadProperty(FilePath.ONEWAY_FILE);
		} catch (IOException e) {
			e.getMessage();
		}
		setLoc_to_box();
		setLoc_to_inputtext();
		setLoc_to_search();
		setLoc_oneway_rbtn();
		setLoc_from_box();
		setLoc_from_inputtext();
		setLoc_from_search();
		setLoc_search_btn();
		setLoc_traveller_class_btn();
		setLoc_traveller_adults_btn();
		setLoc_traveller_children_btn();
		setLoc_traveller_infants_btn();
		setLoc_traveller_choose_travel_class_btn();
		setLoc_traveller_apply_btn();
		setLoc_non_stop_cbox();
		setLoc_departure_12noon_to_6pm_cbox();
		setLoc_arrival_6am_to_12noon_cbox();
		setLoc_sortby_departure_btn();
		setLoc_book_now_btn();
		setLoc_flight_details_btn();
		setLoc_continue_btn();
		setLoc_add_adult_btn();
		setLoc_add_children_btn();
		setLoc_add_infant_btn();
		setLoc_firstname_btn();
		setLoc_lastname_btn();
		setLoc_m_gender_rbtn();
		setLoc_f_gender_rbtn();
		setLoc_date_of_birth_date_btn();
		setLoc_date_of_birth_month_btn();
		setLoc_date_of_birth_year_btn();
		setLoc_contact_info_country_code_click_dpdn();
		setLoc_contact_info_country_code_select_dpdn();
		setLoc_contact_info_mob_no_text();
		setLoc_contact_info_email_text();
		setLoc_flight_details_continue_btn();
		setloc_calender_departure_date_btn();
		setLoc_to_inputtext();
		setloc_departure_btn();
		
		
	}

	public String getLoc_to_box() {
		return loc_to_box;
	}

	public void setLoc_to_box() {
		this.loc_to_box = onewayProperty.getProperty("loc.to.box");
	}

	public String getLoc_to_inputtext() {
		return loc_to_inputtext;
	}

	public void setLoc_to_inputtext() {
		this.loc_to_inputtext = onewayProperty.getProperty("loc.to.inputtext");
	}

	public String getLoc_to_search() {
		return loc_to_search;
	}

	public void setLoc_to_search() {
		this.loc_to_search = onewayProperty.getProperty("loc.to.search");
	}

	public String getLoc_oneway_rbtn() {
		return loc_oneway_rbtn;
	}

	public void setLoc_oneway_rbtn() {
		this.loc_oneway_rbtn = onewayProperty.getProperty("loc.oneway.rbtn");
	}

	public String getLoc_from_box() {
		return loc_from_box;
	}

	public void setLoc_from_box() {
		this.loc_from_box = onewayProperty.getProperty("loc.from.box");
	}

	public String getLoc_from_inputtext() {
		return loc_from_inputtext;
	}

	public void setLoc_from_inputtext() {
		this.loc_from_inputtext = onewayProperty.getProperty("loc.from.inputtext");
	}

	public String getLoc_from_search() {
		return loc_from_search;
	}

	public void setLoc_from_search() {
		this.loc_from_search = onewayProperty.getProperty("loc.from.search");
	}

	public String getLoc_search_btn() {
		return loc_search_btn;
	}

	public void setLoc_search_btn() {
		this.loc_search_btn = onewayProperty.getProperty("loc.search.btn");
	}
	
	public String getloc_departure_btn() {
		return loc_departure_btn;
	}

	public void setloc_departure_btn() {
		this.loc_departure_btn = onewayProperty.getProperty("loc.calender.departure.btn");
	}
	
	public String getloc_calender_departure_date_btn() {
		return loc_calender_departure_date_btn;
	}

	public void setloc_calender_departure_date_btn() {
		this.loc_calender_departure_date_btn = onewayProperty.getProperty("loc.calender.departure_date.btn");
	}

	public String getLoc_traveller_class_btn() {
		return loc_traveller_class_btn;
	}

	public void setLoc_traveller_class_btn() {
		this.loc_traveller_class_btn = onewayProperty.getProperty("loc.traveller&class.btn");
	}

	public String getLoc_traveller_adults_btn() {
		return loc_traveller_adults_btn;
	}

	public void setLoc_traveller_adults_btn() {
		this.loc_traveller_adults_btn = onewayProperty.getProperty("loc.traveller.adults.btn");
	}

	public String getLoc_traveller_children_btn() {
		return loc_traveller_children_btn;
	}

	public void setLoc_traveller_children_btn() {
		this.loc_traveller_children_btn = onewayProperty.getProperty("loc.traveller.children.btn");
	}

	public String getLoc_traveller_infants_btn() {
		return loc_traveller_infants_btn;
	}

	public void setLoc_traveller_infants_btn() {
		this.loc_traveller_infants_btn = onewayProperty.getProperty("loc.traveller.infants.btn");
	}

	public String getLoc_traveller_choose_travel_class_btn() {
		return loc_traveller_choose_travel_class_btn;
	}

	public void setLoc_traveller_choose_travel_class_btn() {
		this.loc_traveller_choose_travel_class_btn = onewayProperty
				.getProperty("loc.traveller.choose_travel_class.btn");
	}

	public String getLoc_traveller_apply_btn() {
		return loc_traveller_apply_btn;
	}

	public void setLoc_traveller_apply_btn() {
		this.loc_traveller_apply_btn = onewayProperty.getProperty("loc.traveller.apply.btn");
	}

	public String getLoc_non_stop_cbox() {
		return loc_non_stop_cbox;
	}

	public void setLoc_non_stop_cbox() {
		this.loc_non_stop_cbox = onewayProperty.getProperty("loc.non_stop.cbox");
	}

	public String getLoc_departure_12noon_to_6pm_cbox() {
		return loc_departure_12noon_to_6pm_cbox;
	}

	public void setLoc_departure_12noon_to_6pm_cbox() {
		this.loc_departure_12noon_to_6pm_cbox = onewayProperty.getProperty("loc.departure.12noon_to_6pm.cbox");
	}

	public String getLoc_arrival_6am_to_12noon_cbox() {
		return loc_arrival_6am_to_12noon_cbox;
	}

	public void setLoc_arrival_6am_to_12noon_cbox() {
		this.loc_arrival_6am_to_12noon_cbox = onewayProperty.getProperty("loc.arrival.6am_to_12noon.cbox");
	}

	public String getLoc_sortby_departure_btn() {
		return loc_sortby_departure_btn;
	}

	public void setLoc_sortby_departure_btn() {
		this.loc_sortby_departure_btn = onewayProperty.getProperty("loc.sortby.departure.btn");
	}

	public String getLoc_book_now_btn() {
		return loc_book_now_btn;
	}

	public void setLoc_book_now_btn() {
		this.loc_book_now_btn = onewayProperty.getProperty("loc.book_now.btn");
	}

	public String getLoc_flight_details_btn() {
		return loc_flight_details_btn;
	}

	public void setLoc_flight_details_btn() {
		this.loc_flight_details_btn = onewayProperty.getProperty("loc.flight_details.btn");
	}

	public String getLoc_continue_btn() {
		return loc_continue_btn;
	}

	public void setLoc_continue_btn() {
		this.loc_continue_btn = onewayProperty.getProperty("loc.continue.btn");
	}

	public String getLoc_add_adult_btn() {
		return loc_add_adult_btn;
	}

	public void setLoc_add_adult_btn() {
		this.loc_add_adult_btn = onewayProperty.getProperty("loc.add_adult.btn");
	}

	public String getLoc_add_children_btn() {
		return loc_add_children_btn;
	}

	public void setLoc_add_children_btn() {
		this.loc_add_children_btn = onewayProperty.getProperty("loc.add_children.btn");
	}

	public String getLoc_add_infant_btn() {
		return loc_add_infant_btn;
	}

	public void setLoc_add_infant_btn() {
		this.loc_add_infant_btn = onewayProperty.getProperty("loc.add_infant.btn");
	}

	public String getLoc_firstname_btn() {
		return loc_firstname_btn;
	}

	public void setLoc_firstname_btn() {
		this.loc_firstname_btn = onewayProperty.getProperty("loc.firstname.btn");
	}

	public String getLoc_lastname_btn() {
		return loc_lastname_btn;
	}

	public void setLoc_lastname_btn() {
		this.loc_lastname_btn = onewayProperty.getProperty("loc.lastname.btn");
	}

	public String getLoc_m_gender_rbtn() {
		return loc_m_gender_rbtn;
	}

	public void setLoc_m_gender_rbtn() {
		this.loc_m_gender_rbtn = onewayProperty.getProperty("loc.m_gender.rbtn");
	}

	public String getLoc_f_gender_rbtn() {
		return loc_f_gender_rbtn;
	}

	public void setLoc_f_gender_rbtn() {
		this.loc_f_gender_rbtn = onewayProperty.getProperty("loc.f_gender.rbtn");
	}

	public String getLoc_date_of_birth_date_btn() {
		return loc_date_of_birth_date_btn;
	}

	public void setLoc_date_of_birth_date_btn() {
		this.loc_date_of_birth_date_btn = onewayProperty.getProperty("loc.date_of_birth.date.btn");
	}

	public String getLoc_date_of_birth_month_btn() {
		return loc_date_of_birth_month_btn;
	}

	public void setLoc_date_of_birth_month_btn() {
		this.loc_date_of_birth_month_btn = onewayProperty.getProperty("loc.date_of_birth.month.btn");
	}

	public String getLoc_date_of_birth_year_btn() {
		return loc_date_of_birth_year_btn;
	}

	public void setLoc_date_of_birth_year_btn() {
		this.loc_date_of_birth_year_btn = onewayProperty.getProperty("loc.date_of_birth.year.btn");
	}

	public String getLoc_contact_info_country_code_click_dpdn() {
		return loc_contact_info_country_code_click_dpdn;
	}

	public void setLoc_contact_info_country_code_click_dpdn() {
		this.loc_contact_info_country_code_click_dpdn = onewayProperty.getProperty("loc.contact_info.country_code_click.dpdn");
	}

	public String getLoc_contact_info_country_code_select_dpdn() {
		return loc_contact_info_country_code_select_dpdn;
	}

	public void setLoc_contact_info_country_code_select_dpdn() {
		this.loc_contact_info_country_code_select_dpdn = onewayProperty.getProperty("loc.contact_info.country_code_select.dpdn");
	}

	public String getLoc_contact_info_mob_no_text() {
		return loc_contact_info_mob_no_text;
	}

	public void setLoc_contact_info_mob_no_text() {
		this.loc_contact_info_mob_no_text = onewayProperty.getProperty("loc.contact_info.mob_no.text");
	}

	public String getLoc_contact_info_email_text() {
		return loc_contact_info_email_text;
	}

	public void setLoc_contact_info_email_text() {
		this.loc_contact_info_email_text = onewayProperty.getProperty("loc.contact_info.email.text");
	}

	public String getLoc_flight_details_continue_btn() {
		return loc_flight_details_continue_btn;
	}

	public void setLoc_flight_details_continue_btn() {
		this.loc_flight_details_continue_btn = onewayProperty.getProperty("loc.flight_details.continue.btn");
	}

	public static void main(String[] args) {
		OneWayTrip details = new OneWayTrip();
		System.out.println(details.getLoc_continue_btn());
	}
}
