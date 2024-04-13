# REST API Product

This repository contains Java files for a simple REST API for managing products.

## Overview

The project consists of a REST controller and an entity class:

1. **Controller**: `ProductRestController.java` handles HTTP requests related to products.
2. **Entity**: `Product.java` represents the product entity.

## Controller

### `ProductRestController.java`

This REST controller class provides endpoints for retrieving product information.

- **Endpoint**: `/api/products`
- **Method**: `GET`
- **Description**: Retrieves a list of products.

## Entity

### `Product.java`

This entity class represents a product with attributes such as ID, name, description, and price.

## Usage

To use the REST API:

1. Deploy the application to a server.
2. Send HTTP requests to the provided endpoint to retrieve product information.

## Example Request

To retrieve the list of products, send a GET request to `/api/products`.

## Example Response

The response will be a JSON array containing information about the products.

```json
[
    {
        "id": 1,
        "name": "Wireless Mouse",
        "description": "Ergonomic wireless mouse with adjustable DPI and long battery life.",
        "price": 29.99
    },
    {
        "id": 2,
        "name": "Bluetooth Speaker",
        "description": "Portable Bluetooth speaker with deep bass and 360-degree sound for indoor and outdoor use.",
        "price": 49.99
    },
    {
        "id": 3,
        "name": "Fitness Tracker",
        "description": "Smart fitness tracker with heart rate monitor, step counter, and sleep tracker for better health management.",
        "price": 79.99
    }
]

# Dependencies
- Spring Boot: The Java files are intended for use with Spring Boot applications.

## Author

- Mahmoud Najmeh

# License
This project is licensed under the MIT License. See the LICENSE file for details.
