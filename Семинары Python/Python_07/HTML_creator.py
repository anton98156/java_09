from user_interface import name_view
from user_interface import phone_number_view
from user_interface import description_view

def html_create():
    style = 'style="front-size:32px;"'
    html = '<html>\n <head></head>\n <body>\n'
    html += '   <p {}>Name: {} c</p>\n'\
        .format(style, name_view())
    html += '   <p {}>Phone_number: {} m/s</p>\n'\
        .format(style, phone_number_view())
    html += '   <p {}>Description: {} mmHg</p>\n'\
        .format(style, description_view())
    html += '   </body>\n</html>'

    with open('index.html', 'w') as page:
        page.write(html)

    return html