class ServiceCall:
    def __init__(self, customer_name= None, customer_id= None, call_type_code= None, date_of_call_string= None):
        self.customer_name: str = customer_name
        self.customer_id: str = customer_id
        self.call_type_code: str = call_type_code
        self.date_of_call_string: str = date_of_call_string

