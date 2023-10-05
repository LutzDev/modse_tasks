from Reader import Reader
from ReaderStrategy import ReaderStrategy
from classes.Usage import Usage
from classes.ServiceCall import ServiceCall

def configure_service_call() -> ReaderStrategy:
    result: ReaderStrategy = ReaderStrategy("SVCL", ServiceCall)
    result.add_field_extractor(4, 18, "customer_name")
    result.add_field_extractor(19, 23, "customer_id")
    result.add_field_extractor(24, 27, "call_type_code")
    result.add_field_extractor(28, 35, "date_of_call_string")
    return result


def configure_usage() -> ReaderStrategy:
    result: ReaderStrategy = ReaderStrategy("USGE", Usage)
    result.add_field_extractor(4, 8, "customer_id")
    result.add_field_extractor(9, 22, "customer_name")
    result.add_field_extractor(23, 30, "read_date")
    return result

def configure(target: Reader) -> None:
    target.add_strategy(configure_service_call())
    target.add_strategy(configure_usage())


reader: Reader = Reader()
configure(reader)
result = reader.process("datasets/A1_a_service_data.txt")

#Ausgabe
print()
for value in result:
    print(type(value))
    for attr, field in vars(value).items():
        print(attr, field)
    print()


