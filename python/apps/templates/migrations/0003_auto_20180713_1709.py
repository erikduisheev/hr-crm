# Generated by Django 2.0.6 on 2018-07-13 11:09

from django.db import migrations


class Migration(migrations.Migration):

    dependencies = [
        ('templates', '0002_auto_20180706_1640'),
    ]

    operations = [
        migrations.RemoveField(
            model_name='template',
            name='attachments',
        ),
        migrations.DeleteModel(
            name='Attachment',
        ),
        migrations.DeleteModel(
            name='Template',
        ),
    ]