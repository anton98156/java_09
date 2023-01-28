import data_provider as provider
import logger as log

def name_view():
    string_name = provider.name_data()
    log.name_logger(string_name)

def phone_number_view():
    string_number = provider.phone_number_data()
    log.phone_number_logger(string_number)

def description_view():
    string_desc = provider.description_data()
    log.description_logger(string_desc)

def create_data():
    name_view()
    phone_number_view()
    description_view()