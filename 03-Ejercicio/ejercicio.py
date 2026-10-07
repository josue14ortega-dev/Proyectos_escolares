cantidad_productos = int(input('Ingresa la cantidad de productos: '))
precioU = int(input('Ingresa el precio unitario: '))
importe_original = int(cantidad_productos * precioU)
if importe_original >= 2500:
    descuento = importe_original * 0.1
    CargoE = 0
else:
    descuento = 0
    CargoE = 150
Total = importe_original - descuento + CargoE
print(f"El importe original es: {importe_original}  El descuento es de:  {descuento}  El cargo de envio es de:  {CargoE} Y el total es de:  {Total}")